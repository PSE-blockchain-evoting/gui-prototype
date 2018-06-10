package com.evoting.components;

import com.evoting.components.listExtensions.DescriptionExtension;
import com.evoting.components.listExtensions.NumberedExtension;
import com.evoting.components.listExtensions.RemovableExtension;
import com.evoting.components.listExtensions.TextFieldExtension;

import javax.swing.*;

public class CandidateList extends ExtendableList{

    private CandidateList(ListExtension e) {
        super(e);
    }

    public static CandidateList createCandidateList(JFrame parent){
        NumberedExtension ne = new NumberedExtension(new TextFieldExtension(new DescriptionExtension( new RemovableExtension(null), parent)));
        CandidateList cl = new CandidateList(ne);
        ne.setList(cl);
        return cl;
    }
}
