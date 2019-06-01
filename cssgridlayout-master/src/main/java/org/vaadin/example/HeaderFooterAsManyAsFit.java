package org.vaadin.example;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Article;
import com.vaadin.flow.component.html.Aside;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Footer;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;


/**
 * The main view contains a button and a click listener.
 */
@Route("headerfooterasmanyasfit")
@Tag("header-footer-asmanyasfit")
@HtmlImport("header-footer-asmanyasfit.html")
public class HeaderFooterAsManyAsFit extends PolymerTemplate<TemplateModel> {

    @Id("header")
    private Header header;

    @Id("panela")
    private Div panela;


    @Id("footer")
    private Footer footer;

    public HeaderFooterAsManyAsFit() {
        getElement().getStyle().set("padding","40px");
//        getElement().getStyle().set("width","100%");
//        getElement().getStyle().set("height","100%");
//        getElement().getStyle().set("box-sizing","border-box");

        header.add(new Text(" Header"));
        panela.add(new Text("Content"));
        panela.add(new Button("Sample Button", e->{
            Notification.show(e.getSource().getText()+" clicked");
        }));
//        sidebar.add(new Text("Sidebar"));
//        
//        footer.add(new Text("Footer"));
    }
}
