package com.mc.exercise

import io.StdIn

/**
  * Created by afarooqs on 7/27/18.
  */
object Sentences {
  def main(args: Array[String]): Unit = {

    val sentence = StdIn.readLine("What's the sentence?")
    val sentenceWithoutPunctuation = sentence.replaceAll("""[\p{Punct}]""", "")
    val wordsList: List[String] = sentenceWithoutPunctuation.split(" ").toList
    val wordCountsMap: Map[String, Int] = wordsList.map(w => w -> w.length).toMap
    val maxWordLength = wordCountsMap.valuesIterator.max
    val longestWords = wordCountsMap.filter(p => p._2 == maxWordLength)

    /**
      * Output and verification
      */
    println("Cleaned words were: " + sentenceWithoutPunctuation.mkString(" "))
    println("Longest word(s) in the sentence is(are) : " + longestWords.keys.mkString(", "))
    println("Length of longest word is: " + maxWordLength)
  }
}
