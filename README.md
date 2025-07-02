# 🏨 Otel Rezervasyon ve Fiyatlandırma Sistemi

## 📋 Proje Açıklaması

Bu proje, Java programlama dili ile geliştirilmiş kapsamlı bir otel rezervasyon ve fiyatlandırma sistemidir. Sistem, farklı misafir sayıları, aile/arkadaş grubu ayrımı, çocuk sayısı, VIP üyelik durumu ve kalış süresi gibi çeşitli faktörleri göz önünde bulundurarak dinamik fiyat hesaplaması yapar.

## ✨ Özellikler

### 🎯 Ana Fonksiyonlar
- **Dinamik Fiyatlandırma**: Misafir sayısına göre otomatik fiyat hesaplama
- **Grup Tipi Ayrımı**: Aile ve arkadaş grubu için farklı tarife sistemleri
- **Çocuk Dostu Fiyatlandırma**: Çocuk sayısına göre özel hesaplanmış indirimler
- **VIP Üyelik Sistemi**: VIP üyeler için %5 özel indirim
- **Dönemsel İndirimler**: Kalış süresine göre değişken indirim oranları
- **Hafta İçi/Hafta Sonu Ayrımı**: Kısa süreli konaklamalar için özel fiyatlandırma
- **Rezervasyon Onay Sistemi**: Kullanıcı tercihine göre rezervasyon tamamlama

### 💰 Fiyatlandırma Kuralları

#### Tek Misafir
- **1 Misafir**: 280 TL (sabit fiyat)

#### Arkadaş Grupları
- **2 Misafir**: 200 TL × 2 = 400 TL
- **3 Misafir**: 170 TL × 3 = 510 TL
- **4 Misafir**: 150 TL × 4 = 600 TL
- **4+ Misafir**: Grup hesaplama algoritması

#### Aileler (Çocuksuz)
- Arkadaş grupları ile aynı fiyatlandırma

#### Aileler (Çocuklu)
- **1 Çocuk**: Özel tarife tablosu
- **2 Çocuk**: Ek indirimli tarife
- **3 Çocuk**: Daha fazla indirim
- **4 Çocuk**: Maksimum aile indirimi
- **4+ Çocuk**: Gelişmiş hesaplama algoritması

### 🎫 İndirim Sistemleri

#### VIP Üyelik
- **VIP Üyeler**: %5 indirim

#### Kalış Süresi İndirimleri
- **1-2 Gün (Hafta İçi)**: +%3 indirim
- **1-2 Gün (Hafta Sonu)**: İndirim yok
- **4-7 Gün**: %4 indirim
- **7+ Gün**: %6 indirim

## 🛠 Teknik Özellikler

- **Programlama Dili**: Java
- **Sınıf Adı**: `S200316007`
- **Ana Metod**: Console-based kullanıcı etkileşimi
- **Giriş Sistemi**: Scanner sınıfı ile kullanıcı girdileri
- **Hesaplama Motoru**: Çoklu koşullu dallanma algoritmaları

## 🚀 Kurulum ve Çalıştırma

### Gereksinimler
- Java Development Kit (JDK) 8 veya üzeri
- Herhangi bir Java IDE'si (Eclipse, IntelliJ IDEA, NetBeans) veya komut satırı

### Kurulum Adımları

1. **Proje İndirme**
   ```bash
   git clone https://github.com/kullaniciadi/hotel-service-java.git
   cd hotel-service-java
   ```

2. **Derleme**
   ```bash
   javac Hotel_Service.java
   ```

3. **Çalıştırma**
   ```bash
   java S200316007
   ```

### IDE ile Çalıştırma
1. Projeyi favori IDE'nizde açın
2. `Hotel_Service.java` dosyasını bulun
3. `S200316007` sınıfının `main` metodunu çalıştırın

## 📖 Kullanım Kılavuzu

### Adım Adım Kullanım

1. **Program Başlatma**: Uygulamayı çalıştırdığınızda misafir sayısı sorulacak
2. **Grup Tipi Seçimi**: Aile (1) veya arkadaş grubu (2) seçeneğini belirtin
3. **Çocuk Bilgisi**: Aile seçtiyseniz çocuk varlığını belirtin (3: Evet, 4: Hayır)
4. **Çocuk Sayısı**: Çocuğunuz varsa sayısını girin
5. **VIP Durumu**: VIP üyeliğinizi belirtin (1: Evet, 2: Hayır)
6. **Kalış Süresi**: Konaklama sürenizi kategori olarak seçin
7. **Tarih Bilgisi**: Kısa konaklamalar için hafta içi/hafta sonu seçimi
8. **Gün Sayısı**: Tam konaklama gün sayısını girin
9. **Rezervasyon**: Final fiyat sonrası rezervasyon onayı

### Örnek Kullanım
```
Misafir sayısı: 4
Grup tipi: 1 (Aile)
Çocuk var mı: 3 (Evet)
Çocuk sayısı: 2
VIP üye: 1 (Evet)
Kalış süresi: 2 (4-7 gün)
Gün sayısı: 5
```

## 🎮 Etkileşimli Menüler

### Ana Seçenekler
- **1**: Aile rezervasyonu
- **2**: Arkadaş grubu rezervasyonu
- **3**: Çocuk var
- **4**: Çocuk yok

### VIP Seçenekleri
- **1**: VIP üye (%5 indirim)
- **2**: Normal müşteri

### Kalış Süresi Kategorileri
- **1**: 1-2 gün (hafta içi/hafta sonu seçimi)
- **2**: 4-7 gün (%4 indirim)
- **3**: 7+ gün (%6 indirim)

## 📊 Fiyat Hesaplama Algoritması

Sistem, aşağıdaki sırayla fiyat hesaplaması yapar:

1. **Temel Fiyat**: Misafir sayısı ve grup tipine göre
2. **Çocuk İndirimi**: Çocuk sayısına göre ek hesaplama
3. **VIP İndirimi**: VIP üyeler için %5 indirim
4. **Süre İndirimi**: Kalış süresine göre ek indirimler
5. **Final Fiyat**: Gün sayısı ile çarpım

## 🔧 Geliştirme ve Katkı

### Proje Yapısı
```
Hotel-service-java/
├── Hotel_Service.java    # Ana program dosyası
├── README.md            # Proje dokümantasyonu
└── .gitignore          # Git ignore dosyası
```

### Geliştirme Önerileri
- [ ] GUI arayüz eklenmesi
- [ ] Veritabanı entegrasyonu
- [ ] Online rezervasyon sistemi
- [ ] Çoklu dil desteği
- [ ] Mobil uygulama versiyonu

### Katkıda Bulunma
1. Bu repoyu fork edin
2. Yeni bir feature branch oluşturun (`git checkout -b feature/AmazingFeature`)
3. Değişikliklerinizi commit edin (`git commit -m 'Add some AmazingFeature'`)
4. Branch'inizi push edin (`git push origin feature/AmazingFeature`)
5. Bir Pull Request oluşturun

## 📝 Sürüm Geçmişi

- **v1.0.0** - İlk sürüm
  - Temel rezervasyon sistemi
  - Fiyat hesaplama algoritması
  - VIP üyelik sistemi
  - Dönemsel indirimler

## 🤝 Destek ve İletişim

Bu proje hakkında sorularınız, önerileriniz veya bug raporlarınız için:
- GitHub Issues kullanabilirsiniz
- Pull Request gönderebilirsiniz
- Dokümantasyon iyileştirmeleri önerebilirsiniz

## 📄 Lisans

Bu proje MIT Lisansı altında lisanslanmıştır. Detaylar için `LICENSE` dosyasını inceleyiniz.

## 🙏 Teşekkürler

Bu projeyi geliştirirken katkıda bulunan herkese teşekkür ederiz. Özellikle Java programlama konusundaki deneyimlerini paylaşan geliştirici topluluğuna minnettarız.

---

⭐ **Bu projeyi beğendiyseniz star vermeyi unutmayın!**

📮 **Sorularınız için issue açabilir veya doğrudan iletişime geçebilirsiniz.** 