/*
 * This source file was generated by the Gradle 'init' task
 */
package demo

import spock.lang.Specification

class LibraryTest extends Specification {
    def "someLibraryMethod returns true"() {
        setup:
        def lib = new Library()

        when:
        def result = lib.someLibraryMethod()

        then:
        result == true
    }
}
