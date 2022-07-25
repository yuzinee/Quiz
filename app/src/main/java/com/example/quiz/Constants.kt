package com.example.quiz

object Constants {

    const val USER_NAME: String = "user name"
    const val TOTAL_QUESTIONS: String = "total questions"
    const val CORRECT_ANSWERS: String = "correc answers"

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "이 과일의 이름은 무엇일까요?",
            R.drawable.apple,
            "Apple", "banana", "avocado", "kiwi",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            2, "이 과일의 이름은 무엇일까요?",
            R.drawable.avocado,
            "melon", "banana", "avocado", "kiwi",
            3
        )
        questionList.add(que2)


        val que3 = Question(
            3, "이 과일의 이름은 무엇일까요?",
            R.drawable.banana,
            "lomon", "banana", "avocado", "kiwi",
            2
        )
        questionList.add(que3)


        val que4 = Question(
            4, "이 과일의 이름은 무엇일까요?",
            R.drawable.grape,
            "Apple", "banana", "grape", "kiwi",
            3
        )
        questionList.add(que4)


        val que5 = Question(
            5, "이 과일의 이름은 무엇일까요?",
            R.drawable.kiwi,
            "grape", "banana", "lemon", "kiwi",
            4
        )
        questionList.add(que5)


        val que6 = Question(
            6, "이 과일의 이름은 무엇일까요?",
            R.drawable.melon,
            "melon", "banana", "avocado", "lemon",
            1
        )
        questionList.add(que6)


        val que7 = Question(
            7, "이 과일의 이름은 무엇일까요?",
            R.drawable.orange,
            "Apple", "orange", "avocado", "kiwi",
            2
        )
        questionList.add(que7)


        val que8 = Question(
            8, "이 과일의 이름은 무엇일까요?",
            R.drawable.plum,
            "grape", "strawberry", "plum", "orange",
            3
        )
        questionList.add(que8)


        val que9 = Question(
            0, "이 과일의 이름은 무엇일까요?",
            R.drawable.lemon,
            "Apple", "orange", "lemon", "kiwi",
            3
        )
        questionList.add(que9)

        return questionList
    }
}