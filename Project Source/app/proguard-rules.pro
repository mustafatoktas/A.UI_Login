# Android log sınıflarını kaldırır
-assumenosideeffects class android.util.Log {
    public static *** d(...);
    public static *** v(...);
    public static *** i(...);
    public static *** w(...);
    public static *** e(...);
}

# Unused kodları kaldırma
-dontwarn com.mustafatoktas.loginui.**
-dontnote com.mustafatoktas.loginui.**

# Kotlin stdlib optimizasyonları
-keep class kotlin.Metadata { *; }
-keep class kotlin.** { *; }

# com.mustafatoktas.nottut.ui.navigation paketi altındaki tüm sınıfları ve
# içlerindeki her şeyi karartmadan koru
-keep class com.mustafatoktas.loginui.ui.navigation.** { *; }