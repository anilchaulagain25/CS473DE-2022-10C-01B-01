package edu.miu.quizapplication.dal.database

import edu.miu.quizapplication.dal.models.Question

class SampleQuestions {
    companion object {
        public fun get(): List<Question> {
            return listOf(
                Question(
                    id = 1,
                    question = "What is Kotlin?",
                    option_one = "A programming language",
                    option_two = "A type of fish",
                    option_three = "A car model",
                    option_four = "A music genre",
                    correct_answer = "1",
                    user_answer = ""
                ),
                Question(
                    id = 2,
                    question = "What is the syntax for declaring a variable in Kotlin?",
                    option_one = "var myVariable = 10",
                    option_two = "val myVariable: Int = 10",
                    option_three = "let myVariable = 10",
                    option_four = "const myVariable = 10",
                    correct_answer = "2",
                    user_answer = ""
                ),
                Question(
                    id = 3,
                    question = "What are some features of Kotlin that make it a good programming language?",
                    option_one = "Interoperability with Java",
                    option_two = "Improved syntax and readability",
                    option_three = "Reduced boilerplate code",
                    option_four = "All of the above",
                    correct_answer = "4",
                    user_answer = ""
                ),
                Question(
                    id = 4,
                    question = "What is a Kotlin class and how do you create one?",
                    option_one = "A template for creating objects, created using the 'class' keyword",
                    option_two = "A way to store data, created using the 'struct' keyword",
                    option_three = "A way to organize code, created using the 'namespace' keyword",
                    option_four = "A way to define functions, created using the 'function' keyword",
                    correct_answer = "1",
                    user_answer = ""
                ),
                Question(
                    id = 5,
                    question = "How do you create a function in Kotlin?",
                    option_one = "Using the 'def' keyword",
                    option_two = "Using the 'function' keyword",
                    option_three = "Using the 'fun' keyword",
                    option_four = "Using the 'method' keyword",
                    correct_answer = "3",
                    user_answer = ""
                ),

                Question(
                    id = 6,
                    question = "What is the difference between a class and an object in Kotlin?",
                    option_one = "A class is a template for creating objects, while an object is a specific instance of a class",
                    option_two = "A class is a way to store data, while an object is a way to organize code",
                    option_three = "A class is a way to define functions, while an object is a way to create variables",
                    option_four = "There is no difference between a class and an object in Kotlin",
                    correct_answer = "1",
                    user_answer = ""
                ),
                Question(
                    id = 7,
                    question = "What is an extension function in Kotlin?",
                    option_one = "Method with extend keyword",
                    option_two = "Method which has more than 10 lines",
                    option_three = "A function that extends the functionality of a class without modifying the class itself",
                    option_four = "Method which throws exception",
                    correct_answer = "3",
                    user_answer = ""
                ),
                Question(
                    id = 8,
                    question = "How do you define a nullable type in Kotlin?",
                    option_one = "By appending a '?' to the type, such as Int?",
                    option_two = "By writing NullableType",
                    option_three = "Don't need to do anything",
                    option_four = "By putting @Nullable annotation",
                    correct_answer = "1",
                    user_answer = ""
                ),
                Question(
                    id = 10,
                    question = "When did kotlin released?",
                    option_one = "2014",
                    option_two = "2015",
                    option_three = "2016",
                    option_four = "2017",
                    correct_answer = "3",
                    user_answer = ""
                ),
                Question(
                    id = 11,
                    question = "What is Android?",
                    option_one = "A mobile operating system developed by Google",
                    option_two = "A type of smartphone",
                    option_three = "A programming language",
                    option_four = "A software development kit",
                    correct_answer = "1",
                    user_answer = ""
                ),
                Question(
                    id = 12,
                    question = "What is an Android activity?",
                    option_one = "A screen that displays content to the user",
                    option_two = "A class that handles user input",
                    option_three = "A component that represents a single screen in an app",
                    option_four = "All of the above",
                    correct_answer = "3",
                    user_answer = ""
                ),
                Question(
                    id = 13,
                    question = "What is an Android service?",
                    option_one = "A component that performs long-running tasks in the background",
                    option_two = "A class that handles user input",
                    option_three = "A component that represents a single screen in an app",
                    option_four = "A way to store data in an app",
                    correct_answer = "1",
                    user_answer = ""
                ),

                Question(
                    id = 14,
                    question = "What is an Android broadcast receiver?",
                    option_one = "A component that receives and responds to system-wide broadcast announcements",
                    option_two = "A component that performs long-running tasks in the background",
                    option_three = "A component that represents a single screen in an app",
                    option_four = "A way to store data in an app",
                    correct_answer = "1",
                    user_answer = ""
                ),
                Question(
                    id = 15,
                    question = "Kotlin is open-source?",
                    option_one = "True",
                    option_two = "False",
                    option_three = "It was True now False",
                    option_four = "It was False now True",
                    correct_answer = "1",
                    user_answer = ""
                ),
                // add 10 more questions here
            );
        }
    }

}