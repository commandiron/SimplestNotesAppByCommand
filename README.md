# simplest_notes_app_by_command

Native Android simplest notes application written in Kotlin using Jetpack Compose with Android Room library.

* Aim 🏹

The aim of this project is to write a note application with as little code as possible while keeping modern code architecture techniques.

* Screenshots 🖼️

|List|Edit|
|------|-----|
|<img src="https://user-images.githubusercontent.com/50905347/159721738-2482d395-8deb-42cf-a1ba-3caa1ae49197.png" width="250" height="500">|<img src="https://user-images.githubusercontent.com/50905347/159721250-e0b01aaf-fded-42ca-a09a-7679ed1648f9.png" width="250" height="500">|


* Structure 🌲

|App Package Structure|
|---------------------|
|<img src="https://user-images.githubusercontent.com/50905347/159722112-a3734c00-7e1a-4641-9dc3-fea0b8e37df4.png" width="250" height="125">|

* Application - Features ☕
   * Get - Insert - Delete Note
   * Note with title and content

* Tech-stack ⚛️
    * [Kotlin](https://kotlinlang.org/) + [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) - perform background operation
    * [Android Room](https://developer.android.com/training/data-storage/room)
    * [Flows](https://developer.android.com/kotlin/flow)
    * [Hilt](https://github.com/google/dagger) - DI
    * [Jetpack](https://developer.android.com/jetpack)
        * [Navigation](https://developer.android.com/topic/libraries/architecture/navigation/) - deal with whole in-app navigation      
        * [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - store and manage UI-related data in a lifecycle conscious way
        * [Compose](https://developer.android.com/jetpack/compose)
* Architecture 🏗️
    * Model-View-ViewModel
    * [Android Architecture components](https://developer.android.com/topic/libraries/architecture) ([ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel), [Navigation](https://developer.android.com/jetpack/androidx/releases/navigation))
 
 * Todo ✔️
   * Code optimization & cleaning ❌
