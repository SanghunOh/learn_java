// On MacOS
// gcc -fPIC -c -I/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home/include helloworld.c
// gcc -shared -o helloworld.so helloworld.o
#include "jwe_ndk_JWENDKHelloWorld.h"

#include <string.h>
/*
 * Class:     jwe_ndk_JWENDKHelloWorld
 * Method:    show1
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_jwe_1ndk_JWENDKHelloWorld_show1
  (JNIEnv * a, jobject b){
  	printf("show1  \n");
  }

/*
 * Class:     jwe_ndk_JWENDKHelloWorld
 * Method:    show2
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_jwe_1ndk_JWENDKHelloWorld_show2
  (JNIEnv * a, jobject b, jint c){
  	printf("show2 : %d\n", c);
  }

/*
 * Class:     jwe_ndk_JWENDKHelloWorld
 * Method:    show3
 * Signature: ([I)V
 */
JNIEXPORT void JNICALL Java_jwe_1ndk_JWENDKHelloWorld_show3
  (JNIEnv * a, jobject b, jintArray c){
  	jint *A = NULL;
  	A = (*a)->GetIntArrayElements(a, c, NULL);
  	if(A == NULL){
  		printf("error3");
  	} else {
  		printf("show3 : %d %d %d \n", A[0], A[1], A[2]);
  	}
  }

/*
 * Class:     jwe_ndk_JWENDKHelloWorld
 * Method:    show4
 * Signature: (C)V
 */
JNIEXPORT void JNICALL Java_jwe_1ndk_JWENDKHelloWorld_show4
  (JNIEnv * a, jobject b, jchar c){
  	printf("show4 : %c", c);
  }

/*
 * Class:     jwe_ndk_JWENDKHelloWorld
 * Method:    show5
 * Signature: ([C)V
 */
JNIEXPORT void JNICALL Java_jwe_1ndk_JWENDKHelloWorld_show5
  (JNIEnv * a, jobject b, jcharArray c){
  	jchar *A = NULL;
  	A = (*a)->GetCharArrayElements(a,c,NULL);
  	if(A == NULL){
  		printf("error5");
  	} else {
  		printf("show5 : %c %c %c \n", A[0], A[1], A[2]);
	}
  }

/*
 * Class:     jwe_ndk_JWENDKHelloWorld
 * Method:    show6
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_jwe_1ndk_JWENDKHelloWorld_show6__Ljava_lang_String_2
  (JNIEnv * a, jobject b, jstring c){
  	char strbuf[128];
  	const char *sz = (*a)->GetStringUTFChars(a,c,0);
  	strcpy(strbuf, sz);
  	printf("show6 : %s", strbuf);
  	(*a)->ReleaseStringUTFChars(a, c, sz);
  }

/*
 * Class:     jwe_ndk_JWENDKHelloWorld
 * Method:    show6
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_jwe_1ndk_JWENDKHelloWorld_show6__
  (JNIEnv * a, jobject b){
  	jclass cls = (*a)->GetObjectClass(a, b);
  	
  	jmethodID funcM = (*a)->GetMethodID(a, cls, "func", "()V");
  	
  	if(funcM == 0){
  	  	printf("show6 Method func ?? \n");
  	} else {
  	  	printf("show6 Method func ok \n");
  	  	(*a)->CallVoidMethod(a, b, funcM);
  	}
  }

