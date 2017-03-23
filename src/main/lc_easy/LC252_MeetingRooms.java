package main.lc_easy;

import main.Interval;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by wxwcase on 3/22/17.
 */
public class LC252_MeetingRooms {

    // get all interval lengths
    public boolean canAttendMeetings(Interval[] intervals) {

        if (intervals == null || intervals.length == 0) return true;

        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval a, Interval b) {
                if (a.start == b.start) {
                    if (a.end == b.end) {
                        return 0;
                    } else if (a.end > b.end) {
                        return 1;
                    } else {
                        return -1;
                    }
                } else if (a.start > b.start) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });

        for (int i = 1; i < intervals.length; i++) {
            int n = intervals[i].start;
            int ps = intervals[i - 1].start;
            int pe = intervals[i - 1].end;
            if (n >= ps && n < pe) return false;
        }

        return true;
    }

}

