#!/usr/bin/env kotlin
@file:Import("MeetingScheduler.main.kts") //import funcs from other file

// Test when no meetings
check(!hasConflictSorted(listOf()))
// Test when only one meeting
check(!hasConflictSorted(listOf(Meeting(1000, 1100))))
// Test when two meetings overlap
check(hasConflictSorted(listOf(Meeting(1000, 1100), Meeting(1030, 1130))))
// Test when meeting ends exactly when another starts (no conflict)
check(!hasConflictSorted(listOf(Meeting(1000, 1100), Meeting(1100, 1130))))
// test whne one meeting is completely during another
check(hasConflictSorted(listOf(Meeting(1000, 1200), Meeting(1030, 1100))))
println("All tests passed :)")