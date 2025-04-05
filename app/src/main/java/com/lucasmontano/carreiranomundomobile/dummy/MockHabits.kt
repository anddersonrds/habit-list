package com.lucasmontano.carreiranomundomobile.dummy

import com.lucasmontano.carreiranomundomobile.collections.HabitItem
import java.util.*

/**
 * Mock data with [HabitItem] for the collection.
 */
object MockHabits {

  val habitItemList: MutableList<HabitItem> = mutableListOf(
    HabitItem(
      id = UUID.randomUUID().toString(),
      title = "Read the book",
      description = "Read at least 10 pages to improve knowledge and relax.",
      isCompleted = false
    ),
    HabitItem(
      id = UUID.randomUUID().toString(),
      title = "Walk the dog",
      description = "Take the dog for a 30-minute walk to keep it healthy and happy.",
      isCompleted = false
    ),
    HabitItem(
      id = UUID.randomUUID().toString(),
      title = "Do the dishes",
      description = "Wash all dirty dishes after meals to maintain a clean kitchen.",
      isCompleted = false
    ),
    HabitItem(
      id = UUID.randomUUID().toString(),
      title = "Go to the gym",
      description = "Work out for at least 45 minutes to stay fit and energized.",
      isCompleted = false
    ),
    HabitItem(
      id = UUID.randomUUID().toString(),
      title = "Code every day",
      description = "Practice coding for at least 1 hour to improve programming skills.",
      isCompleted = false
    ),
    HabitItem(
      id = UUID.randomUUID().toString(),
      title = "Make a cup of tea",
      description = "Prepare a warm cup of tea to relax and stay hydrated.",
      isCompleted = false
    ),
    HabitItem(
      id = UUID.randomUUID().toString(),
      title = "Make a cup of coffee",
      description = "Brew a fresh cup of coffee to boost energy and focus.",
      isCompleted = false
    ),
    HabitItem(
      id = UUID.randomUUID().toString(),
      title = "Play video game every day",
      description = "Play for 30 minutes to unwind and have fun.",
      isCompleted = false
    )
  )
}
