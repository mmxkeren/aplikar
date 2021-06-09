package com.example.aplikar

object Constant {

    fun getConstant(): ArrayList<QuestionBank>{
        val questionList = ArrayList<QuestionBank>()

        val question1 = QuestionBank(
            1, "Asosial", "Menganalisis", "Rumit", "Berpengaruh", "Ambisius", "Cermat"
        )
        questionList.add(question1)

        val question2 = QuestionBank(
            2, "Kaku","Berhati-hati","Tidak teratur","Kooperatif","Berjiwa petualang","Menyesuaikan diri"
        )
        questionList.add(question2)

        val question3 = QuestionBank(
            3, "Terus terang","Kompleks","Emosional","Empatik","Mudah sepakat","Penuh kesadaran"
        )
        questionList.add(question3)

        val question4 = QuestionBank(
            4, "Apa adanya","Klinis","Ekspresif","Ramah","Tidak pernah merasa cukup","Defensif"
        )
        questionList.add(question4)

        val question5 = QuestionBank(
            5,"Keras kepala","Penuh ingin tahu","Idealistik","Murah hati","Mendominasi","Efisien"
        )
        questionList.add(question5)

        val question6 = QuestionBank(
            1, "Tidak fleksibel","Independen","Imajinatif","Siap menolong","Penuh semangat","Tidak fleksibel"
        )
        questionList.add(question6)

        val question7 = QuestionBank(
            1, "Materialistik","Intelektual","Tidak praktis","Idealistik","Riang","Pandai menahan diri"
        )
        questionList.add(question7)

        val question8 = QuestionBank(
            1, "Alamiah","Instropektif","Impulsive","Baik hati","Mencari","Metodis"
        )
        questionList.add(question8)

        val question9 = QuestionBank(
            1, "Normal","Pesimis","Independen","Sabar","Ekshibisionistik","Patuh"
        )
        questionList.add(question9)

        val question10 = QuestionBank(
            1, "Gigih","Tepat","Intropektif","Persuasif","Ekstrover","Teratur"
        )
        questionList.add(question10)

        val question11 = QuestionBank(
            1, "Praktis","Rasional","Intuitif","Bertanggung jawab","Suka merayu","Gigih"
        )
        questionList.add(question11)

        val question12 = QuestionBank(
            1, "Cukup diri","Antisipatif","Tidak mudah sepakat","Mudah bergaul","Optimis","Praktis"
        )
        questionList.add(question12)

        val question13 = QuestionBank(
            1, "Hemat", "Mengundurkan diri","Terbuka","Bijak","Percaya diri","Sopan"
        )
        questionList.add(question13)

        val question14 = QuestionBank(
            1, "Tidak punya ide","Tidak berprasangka","Orisinil","Penuh pengertian","Mudah bergaul","Hemat"
        )
        questionList.add(question4)

        val question15 = QuestionBank(
            1, "Sulit mau terlibat","Tidak popular","Sensitif","Hangat","Enak diajak bicara","Tidak imajinatif"
        )
        questionList.add(question15)

        return questionList
    }

}