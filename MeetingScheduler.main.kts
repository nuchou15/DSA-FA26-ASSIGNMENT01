#!/usr/bin/env kotlin
data class Meeting(val start: Int, val end: Int)

// Checks every possible pair of meetings to see if any overlap
fun hasConflictStraightforward(meetings: List<Meeting>): Boolean {
    for (i in 0 until meetings.size) { //pick the first meeting in pair
        for (j in i + 1 until meetings.size) {
            val meeting1 = meetings[i]
            val meeting2 = meetings[j]
            //meetings overlap if  meeting1 starts before meeting2 ends and
            // meeting2 starts before meeting1 ends
            // Also, we use < instead of <= because a meeting ending exactly when
            // another starts is not a conflict
            if (meeting1.start < meeting2.end &&
                meeting2.start < meeting1.end) {
                return true
            }
        }
    }
    return false
}
// Runtime for the straightforward algorithm should be O(n^2) because you are
// comparing a meeting with the one before, giving us n(n-1)/2. -
// As n grows, O(n^2) grows quadratically, which is faster than O(nlogn)

// Sorts the meetings by their start time and checks for conflicts
fun hasConflictSorted(meetings: List<Meeting>): Boolean {
    // Sort the meetings from earliest start time to latest
    val sortedMeetings = meetings.sortedBy { it.start }
    //check each meeting against the one immediately after it
    for (i in 0 until sortedMeetings.size - 1) {
        val current = sortedMeetings[i]
        val next = sortedMeetings[i + 1]
        // if the current meeting ends after the next one starts, then the two meetings overlap
        if (current.end > next.start) {
            return true
        }
    }
    return false
}
// Runtime for sorting algorithm will be O(nlogn). As
