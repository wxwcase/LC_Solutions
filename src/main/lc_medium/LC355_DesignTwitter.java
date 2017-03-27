package main.lc_medium;

import java.util.*;

/**
 * Created by wwang on 3/27/2017.
 */
public class LC355_DesignTwitter {

    public class Twitter {

        // {user: tweets}
        Map<Integer, ArrayList<Tweet>> map;

        // {user: follows}
        Map<Integer, Set<Integer>> follows;

        // feeds
        Queue<Tweet> feeds;

        int cnt = 0;

        private static final int BUFFER = 10;

        /** Initialize your data structure here. */
        public Twitter() {
            map = new HashMap<>();
            follows = new HashMap();
            feeds = new PriorityQueue<>(BUFFER, new Comparator<Tweet>() {
                @Override
                public int compare(Tweet a, Tweet b) {
                    return b.timestamp - a.timestamp;
                }
            });
        }

        /** Compose a new tweet. */
        public void postTweet(int userId, int tweetId) {
            Tweet nt = new Tweet(userId, tweetId, cnt++);
            if (map.containsKey(userId)) {
                ArrayList<Tweet> tweets = map.get(userId);
                tweets.add(nt);
            } else {
                ArrayList<Tweet> ls = new ArrayList<>();
                ls.add(nt);
                map.put(userId, ls);
            }
        }

        /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
        public List<Integer> getNewsFeed(int userId) {
            feeds.clear();
            if (follows.containsKey(userId)) {
                Set<Integer> friends = follows.get(userId);

                for (int i : friends) {
                    if (map.containsKey(i)) {
                        ArrayList<Tweet> ts = map.get(i);
                        for (int j = 0; j < BUFFER; j++) {
                            int idx = ts.size() - j - 1;
                            if (idx >= 0) {
                                feeds.add(ts.get(idx));
                            } else {
                                break;
                            }
                        }
                    }
                }
            }

            if (map.containsKey(userId)) {
                ArrayList<Tweet> myTweets = map.get(userId);

                for (int i = 0; i < BUFFER; i++) {
                    int idx = myTweets.size() - i - 1;
                    if (idx >= 0) feeds.add(myTweets.get(idx));
                }
            }

            List<Integer> res = new ArrayList<>();

            for (int i = 0; i < BUFFER; i++) {
                if (feeds.size() > 0) res.add(feeds.poll().tweetId);
            }

            return res;
        }

        /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
        public void follow(int followerId, int followeeId) {

            if (followerId == followeeId) return;

            if (!follows.containsKey(followerId)) {
                Set<Integer> set = new HashSet<>();
                set.add(followeeId);
                follows.put(followerId, set);
            } else {
                Set<Integer> set = follows.get(followerId);
                set.add(followeeId);
                follows.put(followerId, set);
            }
        }

        /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
        public void unfollow(int followerId, int followeeId) {
            if (follows.containsKey(followerId)) {
                Set<Integer> set = follows.get(followerId);
                if (set.contains(followeeId)) {
                    set.remove(followeeId);
                }
            }
        }
    }

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */
}

class Tweet {

    public int userId;

    public int tweetId;

    public int timestamp;

    public Tweet(int userId, int tweetId, int timestamp) {
        this.userId = userId;
        this.tweetId = tweetId;
        this.timestamp = timestamp;
    }
}