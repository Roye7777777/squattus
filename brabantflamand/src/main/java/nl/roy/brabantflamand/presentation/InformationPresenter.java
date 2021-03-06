package nl.roy.brabantflamand.presentation;

import java.util.ArrayList;
import java.util.List;

import nl.roy.brabantflamand.model.Information;
import nl.roy.brabantflamand.presentation.model.InformationView;

public class InformationPresenter extends BasePresenter
{
    public InformationView present( Information information )
    {
        InformationView view = new InformationView();
        
        view.id = information.getId().toString();
        view.title = information.getName();
        view.text = information.getText();
        return view;
    }
    
    public List<InformationView> present( List<Information> informations )
    {
        List<InformationView> views = new ArrayList<InformationView>();
        
        for( Information information : informations )
            views.add( present( information ) );
        
        return views;
    }
}
