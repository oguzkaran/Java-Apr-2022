/*-----------------------------------------------------------------------------------------------------------------------
    Aşağı seviyede heap'de tahsis edilen nesnelere dinamik tahsis edilen nesneler (dinamik ömürlü) nesneler denir. Bu
    nesnelerin yok edilmesi Java'da "çöp toplayıcı (garbage collector)" denilen ve arka planda çalışan bir akış tarafından
    yapılır. Çöp toplayıcı "artık kullanılmayan (garbage collected, eligible)" yani çöp olan nesneleri yok eder. Burada
    3 temel soru sorulabilir:
    1. Programcı bir nesneyi yok edebilir mi?
    2. "Garbage collected" bir nesne çöp olur olmaz yok edilir mi?
    3. Çöp toplayıcı yok edilmesi gereken bir nesneyi nasıl anlar?

    Cevap 1: Java'da programcı bir nesneyi yok edemez. Yani tahsis edilmiş bir alanı geri bırakamaz (free/delete). Programcı
    kod akışı içerisinde nesneyi yok edilebilir (garbage collected) duruma getirebilir.

    Cevap 2: Çöp toplayıcının ne zaman devreye gireceği standartlarda belirtilmemiştir. Bu, çöp toplayıcı ile birlikte
    JVM ve JRE yazanlara bırakılmıştır (implementation defined). Hemen devreye gireceği garanti değildir. Programcı bu
    bilinçle ve çöp toplayıcının da etkinliğine güvenerek kod yazar.

    Cevap 3: Bir nesnenin yok edilebilir olması o nesneyi gösteren hiç bir referansın kalmaması demektir. Yani nesnenin
    adresinin hiç bir referans tarafından tutulmuyor olması demektir. Bir nesnenin hangi referansllar tarafından tutulduğu
    ve kaç tane referans tarafından tutulduğunun takibi için çeşitli algoritmalar kullanılmaktadır. Bu algoritmanın nasıl
    olacağı da yazanlara bırakılmıştır. Biz burada "referans sayma (reference counting)" algoritması kullanılyor varsayımıyla
    açıklama yapacağız. Bu yöntemde her yaratılan nesne için bir referans sayacı tutulur. Referans sayacı yönteminde her
    yaratılan nesnenin adresi yeni bir referansa atandığında sayaç 1 artırılır. Nesne bir referanstan kopartıldığında sayaç
    1 azaltılır. Böylece sayacı sıfır olan yani aertık hiç bir referans tarafından adresi tutulmayan bir nesne artık
    "garbage collected" olur. Çöp toplayıcı devreye girdiğinde sayacı sıfır olan tüm nesneleri yok eder. Program sonlandığında
    tüm nesneler yok edilir
-----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

class App {
    public static void main(String [] args)
    {

    }
}

