import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.shouldHave

class AnagramCheckerTest : StringSpec() {
    init {
        "should return true if 'a' an anagram of 'a'" {
            AnagramChecker().match("a", "a").shouldBeTrue()
        }
        "should return false if 'a' not an anagram of 'b'" {
            AnagramChecker().match("a", "b").shouldBeFalse()
        }
        "should return true if 'dog' an anagram of 'god'" {
            AnagramChecker().match("dog", "god").shouldBeTrue()
        }
        "should return false if̦ 'abcd' is not an anagram of 'bs'" {
            AnagramChecker().match("abcd", "bc").shouldBeFalse()
        }
        "should not have empty string inputs" {
            AnagramChecker().match("", "").shouldBeFalse()
        }
        "should return true if 'a' is an anagram of 'A'" {
            AnagramChecker().match("a", "A").shouldBeTrue()
        }
        "should return false if 'a' is not an anagram of 'aa'" {
            AnagramChecker().match("a", "aaa").shouldBeFalse()
        }
    }
}
