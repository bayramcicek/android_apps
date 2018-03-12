## Android
#### Beginner android apps
#### Kaynak - [mobilhanem.com](https://www.mobilhanem.com/android-egitimleri/)
* MainActivity --> Uygulama ilk açıldığında ilk çalışacak olan sınıftır.
* Her Activity nin bir yaşam döngüsü var
* onCreate --> Activity başladığında ilk çalışan method
* onCreate methodu içinde setContentView --> Activity nin görsel yapısını belirler
* Her Activity sınıfının AndroidManifest.xml de referansı olmak zorundadır(tanımlama)
* Activity oluşturduğumuzda otomatik olarak Activity referansı AndroidManifest.xml de oluşturulur
* Java Class oluşturursak bu sınıfı Activity den türetmek gerekir ( extends etmek ) 
* Layout otomatik oluşmadığından layout oluşturulur ve setContentView de tanımlanır.

### Activity Yaşam Döngüsü ( Activity Lifecycle )
![Text file](https://www.mobilhanem.com/wp-content/uploads/2017/08/android_activity_lifecycle.jpg)
* onCreate : Activity başlatıldığında ilk çalışan method.
* onStart : onCreate methodu işlemini tamamladıktan sonra çalışan method.
* onResume : Activity çalıştıktan sonra bütün ön yüzdeki işlemler bittiğinde activity devamı için çalışan kısımdır.Activity arka plana geçip tekrar ön plana geldiğinde onResume methodu tetiklenir ve Activity çalışmaya devam eder.
* onPause : Activity arka plana alındığında bu metod tetiklenir.
* onStop : Aktivite arkaplana atıldığında çalışan bir diğer metoddur. Kullanıcı Activitye geri döndüğünde onRestart methodu tetiklenir ve onStart methodundan itibaren yaşam döngüsü devam eder. Eğer kullanıcı geri dönmezse ilgili Activity e ( bu durumda Activity sonlandı veya sistem tarafından kapatıldıysa ) onDestroy methodu tetiklenir.
* onDestroy : Yaşam döngüsünün en son kısmıdır. Activity sonlandığında tetiklenir.Bellekte uygulama için kullanılan tüm kaynaklarda sonlandırılmış olur.
#### Kaynak - [mobilhanem.com](https://www.mobilhanem.com/android-egitimleri/)
