package br.com.gledsonweb.jobplus

import android.os.Bundle
import android.support.v4.app.Fragment
import android.widget.AdapterView
import android.widget.Toast

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.*
import android.widget.*
import br.com.gledsonweb.jobplus.sqlite.Note
import br.com.gledsonweb.jobplus.sqlite.NoteDbManager
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.fragment_list_job.*

class ListJobFragment : Fragment() {

    companion object {
        fun newInstance(): Fragment {
            var fb: ListJobFragment = ListJobFragment()
            return fb
        }
    }

//    private var listNotes = ArrayList<Note>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_job, container, false)


//        loadQueryAll()
//
//        lvNotes.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position, id ->
//            Toast.makeText(activity, "Click on " + listNotes[position].title, Toast.LENGTH_SHORT).show()
//        }
    }


//        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//            menuInflater.inflate(R.menu.menu_items, menu)
//
//            return super.onCreateOptionsMenu(menu)
//        }

//        override fun onOptionsItemSelected(item: MenuItem?): Boolean {
//            if (item != null) {
//                when (item.itemId) {
//                    R.id.action_add -> {
//                        var intent = Intent(this, NoteActivity::class.java)
//                        startActivity(intent)
//                    }
//                }
//            }
//
//            return super.onOptionsItemSelected(item)
//        }

//        override fun onResume() {
//            super.onResume()
//            loadQueryAll()
//        }
//
//        fun loadQueryAll() {
//
//            var dbManager = NoteDbManager(activity!!)
//            val cursor = dbManager.queryAll()
//
//            listNotes.clear()
//            if (cursor.moveToFirst()) {
//
//                do {
//                    val id = cursor.getInt(cursor.getColumnIndex("Id"))
//                    val title = cursor.getString(cursor.getColumnIndex("Title"))
//                    val content = cursor.getString(cursor.getColumnIndex("Content"))
//
//                    listNotes.add(Note(id, title, content))
//
//                } while (cursor.moveToNext())
//            }
//
//            var notesAdapter = NotesAdapter(activity!!, listNotes)
//            lvNotes.adapter = notesAdapter
//        }
//
//        inner class NotesAdapter : BaseAdapter {
//
//            private var notesList = ArrayList<Note>()
//            private var context: Context? = null
//
//            constructor(context: Context, notesList: ArrayList<Note>) : super() {
//                this.notesList = notesList
//                this.context = context
//            }
//
//            override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
//
//                val view: View?
//                val vh: ViewHolder
//
//                if (convertView == null) {
//                    view = layoutInflater.inflate(R.layout.note, parent, false)
//                    vh = ViewHolder(view)
//                    view.tag = vh
//                    Log.i("JSA", "set Tag for ViewHolder, position: " + position)
//                } else {
//                    view = convertView
//                    vh = view.tag as ViewHolder
//                }
//
//                var mNote = notesList[position]
//
//                vh.tvTitle.text = mNote.title
//                vh.tvContent.text = mNote.content
//
//                vh.ivEdit.setOnClickListener {
//                    updateNote(mNote)
//                }
//
//                vh.ivDelete.setOnClickListener {
//                    var dbManager = NoteDbManager(this.context!!)
//                    val selectionArgs = arrayOf(mNote.id.toString())
//                    dbManager.delete("Id=?", selectionArgs)
//                    loadQueryAll()
//                }
//
//                return view
//            }
//
//            override fun getItem(position: Int): Any {
//                return notesList[position]
//            }
//
//            override fun getItemId(position: Int): Long {
//                return position.toLong()
//            }
//
//            override fun getCount(): Int {
//                return notesList.size
//            }
//        }
//
//        private fun updateNote(note: Note) {
//            var intent = Intent(activity, NoteActivity::class.java)
//            intent.putExtra("MainActId", note.id)
//            intent.putExtra("MainActTitle", note.title)
//            intent.putExtra("MainActContent", note.content)
//            startActivity(intent)
//        }
//
//        private class ViewHolder(view: View?) {
//            val tvTitle: TextView
//            val tvContent: TextView
//            val ivEdit: ImageView
//            val ivDelete: ImageView
//
//            init {
//                this.tvTitle = view?.findViewById(R.id.tvTitle) as TextView
//                this.tvContent = view?.findViewById(R.id.tvContent) as TextView
//                this.ivEdit = view?.findViewById(R.id.ivEdit) as ImageView
//                this.ivDelete = view?.findViewById(R.id.ivDelete) as ImageView
//            }
//
//            // with API 26
////        init {
////            this.tvTitle = view?.findViewById<TextView>(R.id.tvTitle) as TextView
////            this.tvContent = view?.findViewById<TextView>(R.id.tvContent) as TextView
////            this.ivEdit = view?.findViewById<ImageView>(R.id.ivEdit) as ImageView
////            this.ivDelete = view?.findViewById<ImageView>(R.id.ivDelete) as ImageView
//        }
    }

