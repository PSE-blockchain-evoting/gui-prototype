package com.evoting.components;

import java.util.List;

public class CandidateList extends ExtendableList{

    private CandidateList(ListExtension e) {
        super(e);
    }

    public static CandidateList createCandidateList(){
        RemovableExtension re = new RemovableExtension(null);
        TextFieldExtension tfe = new TextFieldExtension(re);
        NumberedExtension ne = new NumberedExtension(tfe);

        CandidateList cl = new CandidateList(ne);

        ne.setList(cl);
        tfe.setList(cl);
        re.setList(cl);

        return cl;
    }
}

