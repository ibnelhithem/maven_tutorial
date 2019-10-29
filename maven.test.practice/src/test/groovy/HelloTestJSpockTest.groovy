import spock.lang.Specification

class HelloTestJSpockTest extends Specification {
    def "Method1"() {
        when:
        def foo = "123"

        then:
        true
        println("Hello World")
    }

    def "Method2"() {
        when:
        def foo = "123"

        then:
        true
        println("Hello World")
    }

    def "Name"() {
        when:
        def foo = "123"

        then:
        true
        println("Hello World")
    }
}
