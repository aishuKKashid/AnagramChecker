import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.shouldHave

class AnagramCheckerTest : StringSpec() {
    init {
        "is 'a' an anagram of 'a'" {
            AnagramChecker().match("a", "a").shouldBeTrue()
        }
        "is 'a' not an anagram of 'b'" {
            AnagramChecker().match("a", "b").shouldBeFalse()
        }
        "is 'dog' an anagram of 'god'" {
            AnagramChecker().match("dog", "god").shouldBeTrue()
        }
        " is 'abcd' is not an anagram of 'bs'" {
            AnagramChecker().match("abcd", "bc").shouldBeFalse()
        }
        "should not have empty string inputs" {
            AnagramChecker().match("", "").shouldBeFalse()
        }
        "should match the a and 'A'" {
            AnagramChecker().match("a", "A").shouldBeTrue()
        }
        "is 'a' is not an anagram of 'aa'" {
            AnagramChecker().match("a", "aaa").shouldBeFalse()
        }
    }
}
