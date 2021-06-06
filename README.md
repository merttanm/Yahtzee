# Yahtzee

1-	Özet
Java teknolojisinde JFrame form ara yüzü kullanarak soket programlama ile Yahtzee oyunu.

2-	Proje Konusu
Yahtzee oyunu

3-	Proje Tasarım
Projenin açılışında YahtzeeSimulator.java classı çalışması ile oyunun ana ekranı açılıyor ve bizi böyle bir ekran tasarımı karşılıyor.
 
Bu tasarım geldikten sonra Oyunculardan sırası ile txt_name olarak adlandırdığım JTextField’ ıma kullanıcıdan ismini girmesini bekliyorum. Oyuncu ismini girince ve Oyuna Başla butonuna tıkladığında 
Client’ım servere başlanıyor ve oyuncuları eşleştirmeye gidiyor. Oyuncunun ismi girilmiş eşleştirmiş ve bağlandığı zaman ekranda ki değişimlerin son hali böyle oluyor.

Oyuncular oyuna başladıktan sonra oyunun kuralları gereği her oyuncuya tek elde 3 kere zar atma hakkı veriyorum ekranda random şekilde döndürdüğüm zarları, Zarları Durdur butonuna tıkladığı zaman durdurma işlemi gerçekşetiriyorum.Bu zarların geldiği numaralara göre oyuncu puanlarını giriyor. Mesela 3 tane 1 1 1 geldiğinde oyuncudan Count and add only Aces butonu sırasına oyun puanını yazıyor ve Count and add only Aces butonuna tıklıyor.
 
 

4-	Proje Çıktıları ve Başarı Ölçütleri
Projemde geliştirmiş olduğum oyunda tasarım ve control olarak  eksikleri olmakla birlikte kullancığım bütün JFram’ ler aktif olarak çalışıyor. 


5-	Proje Süresince Yapılanlar
Projemde analiz, tasarım,  kodlama, test gibi süreçlerden geçti. Bana verilen süre boyunca aktif olarak çalışmak ve araştırmakla geçirdim ve geliştirdiğim uygulamamı GitHub a commit etmeyi de unutmadım. Bu sürece ilk olarak Yahtze oyununu araştırmakla başladım bu oyunu ve püf noktalarını öğrendikten sonra, kafamda tasarımı belirginleşti. Oyunun mantığını kavradıktan sonra soket bilgimi kulanarak tasarımla soket tarafına köprü kurdum. Projemde Server- Client işlemlerinde, karşı tarafa data gönderme- alma türünde işlemler yaptım. Bu süreçte hem tasarım yeteneğimi hemde programlama yeteneğimi geliştirmiş oldum ve soket programlamaya hakim olmam konusunda çok faydası oldu.


6-	Ek Açıklamalar
Projemin GitHub linki :  https://github.com/merttanm/Yahtzee

7-	Kaynakça
https://www.geeksforgeeks.org/socket-programming-in-java/
https://www.baeldung.com/a-guide-to-java-sockets
https://www.infoworld.com/article/2853780/socket-programming-for-scalable-systems.html
https://en.wikipedia.org/wiki/Yahtzee

