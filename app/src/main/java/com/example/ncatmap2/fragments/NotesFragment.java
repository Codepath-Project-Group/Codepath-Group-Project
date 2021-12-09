package com.example.ncatmap2.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ncatmap2.PostsAdapter;
import com.example.ncatmap2.R;
import com.example.ncatmap2.ui.notes.Note;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;



public class NotesFragment extends Fragment {
    public static final String TAG = "PostsFragment";
    private RecyclerView rvNotes;
    private PostsAdapter adapter;
    private List<Note> allNotes;

    public NotesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notes, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvNotes = view.findViewById(R.id.rvNotes);

        allNotes = new ArrayList<>();
        adapter = new PostsAdapter(getContext(),allNotes );
        rvNotes.setAdapter(adapter);
        rvNotes.setLayoutManager(new LinearLayoutManager(getContext()));
        queryPosts();
    }

    private void queryPosts() {
        ParseQuery<Note> query = ParseQuery.getQuery(Note.class);
        query.include(Note.KEY_USER);
        query.findInBackground(new FindCallback<Note>() {
            @Override
            public void done(List<Note> objects, ParseException e) {
                if(e != null) {
                    Log.e(TAG, "Issues with getting posts", e);
                    return;
                }
                for(Note note: objects) {
                    Log.i(TAG, "Note: " + note.getKeyText());

                }

                allNotes.addAll(objects);
                adapter.notifyDataSetChanged();
            }
        });
    }
}