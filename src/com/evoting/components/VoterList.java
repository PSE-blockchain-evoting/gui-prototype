package com.evoting.components;

import com.evoting.components.listExtensions.NumberedExtension;
import com.evoting.components.listExtensions.RadioSelectionExtension;
import com.evoting.components.listExtensions.RemovableExtension;
import com.evoting.components.listExtensions.TextFieldExtension;

public class VoterList extends ExtendableList{
    private VoterList(ListExtension mod) {
        super(mod);
    }

    public static VoterList createVoterList(){

        RadioSelectionExtension rse = new RadioSelectionExtension(new TextFieldExtension(new RemovableExtension(null)));
        NumberedExtension ne = new NumberedExtension(rse);
        VoterList vl = new VoterList(ne);
        ne.setList(vl);

        return vl;
    }
}
