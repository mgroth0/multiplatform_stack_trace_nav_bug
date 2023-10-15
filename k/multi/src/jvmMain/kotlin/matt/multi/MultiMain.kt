package matt.multi

import matt.multi.util.commonUtil
import matt.multi.util.jvmUtil
import matt.multi.util.throwExceptionFromCommon
import matt.multi.util.throwExceptionFromJvm


fun main() {
    println("hello kotlin multiplatform")
    commonUtil()
    jvmUtil()
//    throwExceptionFromCommon()
    throwExceptionFromJvm()
}