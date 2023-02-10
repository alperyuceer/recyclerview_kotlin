package com.alperyuceer.ceocompanie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.alperyuceer.ceocompanie.databinding.ActivityDetailsBinding
import com.alperyuceer.ceocompanie.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
//sonradan içerisine veri ekleyeceğimiz diziyi oluşturduk
private lateinit var ceoList: ArrayList<Ceo>
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //boş dizi initialize ediyoruz
        ceoList = ArrayList<Ceo>()

        //verileri classtan oluşturduk
        val elon= Ceo("Elon Musk","Twitter",R.drawable.elonmusk)
        val tim= Ceo("Tim Cook","Apple",R.drawable.timcook)
        val jeff= Ceo("Jeff Bezos","Amazon",R.drawable.jeffbezos)
        val mark2 = Ceo("Mark Zuckerberg 2","Meta",R.drawable.markzuckerberg)
        val mark3 = Ceo("Mark Zuckerberg 3","Meta",R.drawable.markzuckerberg)
        val mark4 = Ceo("Mark Zuckerberg 4","Meta",R.drawable.markzuckerberg)
        val mark5 = Ceo("Mark Zuckerberg 5","Meta",R.drawable.markzuckerberg)
        val mark6 = Ceo("Mark Zuckerberg 6","Meta",R.drawable.markzuckerberg)
        val mark7 = Ceo("Mark Zuckerberg 7","Meta",R.drawable.markzuckerberg)
        val mark8 = Ceo("Mark Zuckerberg 8","Meta",R.drawable.markzuckerberg)

        //verileri ceoList'e ekliyoruz
        ceoList.add(elon)
        ceoList.add(tim)
        ceoList.add(jeff)
        ceoList.add(mark2)
        ceoList.add(mark3)
        ceoList.add(mark4)
        ceoList.add(mark5)
        ceoList.add(mark6)
        ceoList.add(mark7)
        ceoList.add(mark8)
        ceoList.add(mark5)
        ceoList.add(mark6)
        ceoList.add(mark7)
        ceoList.add(mark8)
        ceoList.add(mark5)
        ceoList.add(mark6)
        ceoList.add(mark7)
        ceoList.add(mark8)
        ceoList.add(mark5)
        ceoList.add(mark6)
        ceoList.add(mark7)
        ceoList.add(mark8)
        ceoList.add(mark7)
        ceoList.add(mark8)
        ceoList.add(mark5)
        ceoList.add(mark6)
        ceoList.add(mark7)
        ceoList.add(mark8)
        ceoList.add(mark5)
        ceoList.add(mark6)
        ceoList.add(mark7)
        ceoList.add(mark8)
        ceoList.add(mark7)
        ceoList.add(mark8)
        ceoList.add(mark5)
        ceoList.add(mark6)
        ceoList.add(mark7)
        ceoList.add(mark8)
        ceoList.add(mark5)
        ceoList.add(mark6)
        ceoList.add(mark7)
        ceoList.add(mark8)
        ceoList.add(mark7)
        ceoList.add(mark8)
        ceoList.add(mark5)
        ceoList.add(mark6)
        ceoList.add(mark7)
        ceoList.add(mark8)
        ceoList.add(mark5)
        ceoList.add(mark6)
        ceoList.add(mark7)
        ceoList.add(mark8)

        ceoList.shuffle()

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val ceoAdapter = CeoAdapter(ceoList)
        binding.recyclerView.adapter = ceoAdapter










        //ListView
        /*
        //layout ve datayı bağlamak için Adapter kullanıyoruz
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, ceoList.map { ceo -> ceo.ceoName })

        binding.listView.adapter=adapter

        binding.listView.onItemClickListener= AdapterView.OnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(MainActivity@this,DetailsActivity::class.java)
            intent.putExtra("ceo", ceoList.get(i))
            startActivity(intent)
        }

        */



    }

}