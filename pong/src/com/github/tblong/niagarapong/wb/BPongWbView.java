package com.github.tblong.niagarapong.wb;

import javax.baja.gx.BFont;
import javax.baja.sys.BAbsTime;
import javax.baja.sys.BObject;
import javax.baja.sys.Context;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;
import javax.baja.ui.BBorder;
import javax.baja.ui.BLabel;
import javax.baja.ui.BWidget;
import javax.baja.ui.pane.BBorderPane;
import javax.baja.ui.pane.BEdgePane;
import javax.baja.util.Lexicon;
import javax.baja.workbench.view.BWbView;

import com.tridium.workbench.fieldeditors.BFontFE;

/**
 * Workbench view for Pong game.
 *
 * @author TBLong
 * @creation Jun 30, 2015
 * @version Jul 2, 2015
 *
 */ 
public class BPongWbView
    extends BWbView
{
  /*-
   class BPongWbView
   {
     properties
     {
     }
     actions
     {
     }
     topics
     {
     }
   }
   -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.github.tblong.niagarapong.wb.BPongWbView(2419197384)1.0$ @*/
/* Generated Tue Jun 30 17:59:29 EDT 2015 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPongWbView.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

////////////////////////////////////////////////////////////////
// Attributes
////////////////////////////////////////////////////////////////
  
  private final BPongUserOptions options;
  
  
////////////////////////////////////////////////////////////////
// Constructor
////////////////////////////////////////////////////////////////
  
  public BPongWbView()
  {
    // TODO constructor
    // user options
    this.options = BPongUserOptions.make();

  }
  
  
////////////////////////////////////////////////////////////////
// Lexicon
////////////////////////////////////////////////////////////////
  
  private static final Lexicon LEX = Lexicon.make(BPongWbView.class);

  // TODO fill out LEX
  
  
////////////////////////////////////////////////////////////////
// Overridden methods
////////////////////////////////////////////////////////////////
  
  /*
   * (non-Javadoc)
   * 
   * @see javax.baja.workbench.BWbEditor#doLoadValue(javax.baja.sys.BObject, javax.baja.sys.Context)
   */
  @Override
  protected void doLoadValue(BObject value, Context context) throws Exception
  {
    // TODO build widget tree
    
    // update last opened options
    BAbsTime lastOpened = this.options.getLastOpened();
    this.options.setLastOpened(BAbsTime.now());
    this.options.save();
    

    BWidget topWidget = new BLabel("Top Widget", BFont.make("BankGothic Lt BT", 20));
    BWidget centerWidget = new BLabel("Center Widget", BFont.make("Tahoma", 20));
    BWidget mainEdge =
        new BEdgePane(new BBorderPane(topWidget, BBorder.groove), null, null, null,
                      new BBorderPane(centerWidget, BBorder.groove));
    BWidget mainContent = new BBorderPane(mainEdge);
    // set content
    setContent(mainContent);
  }
  
////////////////////////////////////////////////////////////////
// Command inner classes
////////////////////////////////////////////////////////////////
  
  
}
