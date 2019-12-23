package io.keepcoding.eh_ho

object TopicsRepo {


    val topics: MutableList<Topic> = mutableListOf()



    //Versión 2 del método => usando map

        //Creando un custom getter
    get() { //No acceder a topics para no hacer una llamada recursiva

        if (field.isEmpty()) //si no hay ningún elemento de los topics
            field.addAll(dummyTopics())
        return field //devolvemos el campo
    }


    fun dummyTopics(count: Int=50): List<Topic> {

        /*return(1..count).map({ i: Int ->
            Topic(content = "Content $i", title = "Title $i")

        })*/

        return(1..count).map{
            Topic(content = "Content $it", title = "Title $it")

        }

    }



}



//Versión 1 del método
/* fun dummyTopics(count: Int=50):List<Topic>{ //50 valor por defecto
     //val range: IntRange = 1..10



     val dummyTopics: MutableList<Topic> = mutableListOf()
         for (i in 1..count) {
             val topic: Topic = Topic(title = "Title $i", content = "Content $i")
             dummyTopics.add(topic)
         }

 }*/

