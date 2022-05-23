class AnagramChecker {
    fun match(word1: String, word2: String): Boolean {
        val counter = IntArray(26) { 0 }
        if (word1.length != word2.length) return false
        if (word1.isEmpty() || word2.isEmpty()) return false
        (word1.indices).forEach { index ->
            ++counter[word1[index].lowercaseChar() - 'a']
            --counter[word2[index].lowercaseChar() - 'a']
        }
        return !counter.any { it != 0 }
    }
}
