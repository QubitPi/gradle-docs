/*
 * This source file was generated by the Gradle 'init' task
 */

#include "demo.h"
#include <cassert>

int main() {
    demo::Greeter greeter;
    assert(greeter.greeting().compare("Hello, World!") == 0);
    return 0;
}
