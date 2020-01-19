package com.example.hm_ittp;

import java.util.ArrayList;

public class HmjData {

    public static String[][] data = new String[][]{
            {"0", "Kotlin",
                    "Kotlin adalah bahasa program yang dibuat oleh tim IntelliJ, tim yang juga membuat banyak IDE populer sebelumnya. Mempertemukan masalah kenyamanan programmer untuk membuat aplikasi android dengan performa yang tetap native.. hadirlah salah satu bahasa modern ini yaitu Kotlin.",
                    "https://skspace.sgp1.digitaloceanspaces.com/webAssets/track-cover/kotlin.jpg"},
            {"1", "Java",
                    "Java adalah satu set perangkat lunak komputer dan spesifikasi yang dikembangkan oleh Sun Microsystems, yang kemudian diakuisisi oleh Oracle Corporation, yang menyediakan sistem untuk mengembangkan aplikasi perangkat lunak dan menerapkan hal itu dalam sebuah cross-platform lingkungan komputasi.",
                    "https://skillvalue.com/jobs/wp-content/uploads/sites/7/2019/10/freelance-java-mission-remote-java-9.jpg"},
            {"2", "HTML",
                    "Hypertext Markup Language adalah sebuah bahasa markah yang digunakan untuk membuat sebuah halaman web, menampilkan berbagai informasi di dalam sebuah penjelajah web Internet dan pemformatan hiperteks sederhana yang ditulis dalam berkas format ASCII agar dapat menghasilkan tampilan wujud yang terintegrasi.",
                    "https://3.bp.blogspot.com/-QFJbv3Zlks8/WPV6oRl18GI/AAAAAAAAAN8/WaLM60nBRysfTg1BqpZCpG6XR0rX0llBQCPcB/s1600/html.jpg"},
            {"3", "php",
                    "Hypertext Preprocessor adalah bahasa skrip yang dapat ditanamkan atau disisipkan ke dalam HTML. PHP banyak dipakai untuk memprogram situs web dinamis. PHP dapat digunakan untuk membangun sebuah CMS.",
                    "https://truesecdev.files.wordpress.com/2015/03/logo.jpg"},
            {"4", "C++",
                    "C++ adalah bahasa pemrograman komputer yang di buat oleh Bjarne Stroustrup, yang merupakan perkembangan dari bahasa C dikembangkan di Bell Labs (Dennis Ritchie) pada awal tahun 1970-an, bahasa itu diturunkan dari bahasa sebelumnya, yaitu B. Pada awalnya, bahasa tersebut dirancang sebagai bahasa pemrograman yang dijalankan pada sistem Unix.",
                    "https://i.redd.it/31b2ii8hchi31.jpg"},
            {"5", "C",
                    "Bahasa pemrograman C merupakan salah satu bahasa pemrograman komputer. Dibuat pada tahun 1972 oleh Dennis Ritchie untuk Sistem Operasi Unix di Bell Telephone Laboratories. Meskipun C dibuat untuk memprogram sistem dan jaringan komputer namun bahasa ini juga sering digunakan dalam mengembangkan software aplikasi.",
                    "https://img2.pngdownload.id/20171217/033/letter-c-png-5a36954d474e54.1991877715135266052921.jpg"},
            {"6", "Pyton",
                    "Python adalah bahasa pemrograman interpretatif multiguna[9] dengan filosofi perancangan yang berfokus pada tingkat keterbacaan kode. Python diklaim sebagai bahasa yang menggabungkan kapabilitas, kemampuan, dengan sintaksis kode yang sangat jelas, dan dilengkapi dengan fungsionalitas pustaka standar yang besar serta komprehensif. Python juga didukung oleh komunitas yang besar.",
                    "https://miro.medium.com/max/690/1*jsgLaIkhgF7SzQS1FWIPug.jpeg"},
            {"7", "Ruby",
                    "Ruby adalah bahasa pemrograman dinamis berbasis skrip yang berorientasi objek. Tujuan dari ruby adalah menggabungkan kelebihan dari semua bahasa-bahasa pemrograman skrip yang ada di dunia. Ruby ditulis dengan bahasa pemrograman C dengan kemampuan dasar seperti Perl dan Python.",
                    "https://img2.pngdownload.id/20180614/roo/kisspng-ruby-on-rails-programming-language-computer-progra-rubies-5b227595c86059.2614277315289849818208.jpg"},
            {"8", "Visual Basic",
                    "Microsoft Visual Basic merupakan sebuah bahasa pemrograman yang menawarkan Integrated Development Environment visual untuk membuat program perangkat lunak berbasis sistem operasi Microsoft Windows dengan menggunakan model pemrograman.",
                    "https://jos.co.id/wp-content/uploads/2019/06/visual-basic.jpg"},
            {"9", "C#",
                    "C# merupakan sebuah bahasa pemrograman yang berorientasi objek yang dikembangkan oleh Microsoft sebagai bagian dari inisiatif kerangka .NET Framework.",
                    "https://static.gunnarpeipman.com/wp-content/uploads/2009/10/csharp-featured.png"}
    };

    public static ArrayList<Hmj> getListData(){
        ArrayList<Hmj> list = new ArrayList<>();
        for (String[] aData : data) {
            Hmj hmj = new Hmj();
            hmj.setId(Integer.parseInt(aData[0]));
            hmj.setName(aData[1]);
            hmj.setDescription(aData[2]);
            hmj.setPhoto(aData[3]);

            list.add(hmj);
        }
        return list;
    }
}
