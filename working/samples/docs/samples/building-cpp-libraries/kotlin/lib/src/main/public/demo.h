/*
 * This source file was generated by the Gradle 'init' task
 */

#ifndef DEMO_H
#define DEMO_H

#ifdef _WIN32
#define DEMO_EXPORT_FUNC __declspec(dllexport)
#else
#define DEMO_EXPORT_FUNC
#endif

#include <string>

namespace demo {
    class Greeter {
        public:
        std::string DEMO_EXPORT_FUNC greeting();
    };
}

#endif
