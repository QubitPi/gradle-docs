/*
 * This source file was generated by the Gradle 'init' task
 */
package demo.utilities

import demo.list.LinkedList

object SplitUtils {
    def split(source: String): LinkedList = {
        var lastFind = 0
        val result = new LinkedList()

        var currentFind = source.indexOf(" ", lastFind)
        while (currentFind != -1) {
            var token = source.substring(lastFind)
            if (currentFind != -1) {
                token = token.substring(0, currentFind - lastFind)
            }

            addIfValid(token, result)
            lastFind = currentFind + 1
            currentFind = source.indexOf(" ", lastFind)
        }

        val token = source.substring(lastFind)
        addIfValid(token, result)

        result
    }

    private def addIfValid(token: String, list: LinkedList): Unit = {
        if (isTokenValid(token)) {
            list.add(token)
        }
    }

    private def isTokenValid(token: String): Boolean = {
        !token.isEmpty
    }
}
