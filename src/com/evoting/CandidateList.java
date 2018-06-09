package com.evoting;

import java.awt.event.ActionListener;
import java.util.LinkedList;

public class CandidateList extends DynamicList{

    private LinkedList<CandidateEntry> candidates;
    private LinkedList<ActionListener> entryListener;

    public CandidateList(){
        candidates = new LinkedList<>();
        entryListener = new LinkedList<>();
    }

    public void addCandidate(){
        CandidateEntry newCE = new CandidateEntry(candidates.size() + 1);

        candidates.add(newCE);
        super.addEntry(newCE);
    }
}
