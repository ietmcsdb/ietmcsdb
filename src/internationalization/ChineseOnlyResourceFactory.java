/**
 * 
 */
package internationalization;

import java.util.Properties;

import org.openswing.swing.internationalization.java.*;
import org.openswing.swing.util.java.Consts;
/**
 * @author Administrator
 *
 */
public class ChineseOnlyResourceFactory extends ResourcesFactory {

	  /** internationalization settings */
	  private Resources resources = null;


	  /**
	   * Constructor.
	   * @param currencySymbol currency symbol
	   * @param additionalDictionary additional descriptions
	   * @param showResourceNotFoundWarning warn when no resource key not found
	   */
	  public ChineseOnlyResourceFactory(String currencySymbol,Properties additionalDictionary,boolean showResourceNotFoundWarning) {
	    this(currencySymbol,additionalDictionary,showResourceNotFoundWarning,'/');
	  }



	  /**
	   * Constructor.
	   * @param currencySymbol currency symbol
	   * @param additionalDictionary additional descriptions
	   * @param showResourceNotFoundWarning warn when no resource key not found
	   * @param dateFormatSeparator date format separator; for example: '-' or '/'
	   */
	  public ChineseOnlyResourceFactory(String currencySymbol,Properties additionalDictionary,boolean showResourceNotFoundWarning,char dateFormatSeparator) {
	    Properties dictionary = new Properties();

	    dictionary.putAll(additionalDictionary);

	    //******
	    
	    //******
	    // grid...
	    dictionary.setProperty("of","of");
	    dictionary.setProperty("page","Page");
	    dictionary.setProperty("Remove Filter","Remove Filter");   
	    dictionary.setProperty("This column is not sorteable","This column is not sorteable");
	    dictionary.setProperty("Sorting not allowed","Sorting not allowed");
	    dictionary.setProperty("Maximum number of sorted columns","Maximum number of sorted columns");
	    dictionary.setProperty("Sorting not applicable","Sorting not applicable");
	    dictionary.setProperty("Selected Row","Selected Row");
	    dictionary.setProperty("Selected Rows","Selected Rows");
	    dictionary.setProperty("Cancel changes and reload data?","Cancel changes and reload data?");
	    dictionary.setProperty("Attention","Attention");
	    dictionary.setProperty("Loading data...","Loading data...");
	    dictionary.setProperty("Error while loading data","Error while loading data");
	    dictionary.setProperty("Loading Data Error","Loading Data Error");
	    dictionary.setProperty("Delete Rows?","Delete Rows?");
	    dictionary.setProperty("Delete Confirmation","Delete Confirmation");
	    dictionary.setProperty("Error while deleting rows.","Error while deleting rows.");
	    dictionary.setProperty("Deleting Error","Deleting Error");
	    dictionary.setProperty("Error while saving","Error while saving");
	    dictionary.setProperty("Saving Error","Saving Error");
	    dictionary.setProperty("A mandatory column is empty.","A mandatory column is empty");
	    dictionary.setProperty("Value not valid","Value not valid");
	    dictionary.setProperty("sorting conditions","Sorting conditions");
	    dictionary.setProperty("filtering conditions","Filtering conditions");
	    dictionary.setProperty("filtering and sorting settings","Filtering and sorting settings");
	    dictionary.setProperty("Filtering/Sorting data (CTRL+F)","Filtering/Sorting data (CTRL+F)");
	    dictionary.setProperty("upload file","Upload File");
	    dictionary.setProperty("download file","Download File");

	    // export...
	    dictionary.setProperty("grid export","Grid Export");
	    dictionary.setProperty("export","Export");
	    dictionary.setProperty("exportmnemonic","X");
	    dictionary.setProperty("column","Column");
	    dictionary.setProperty("sel.","Sel.");
	    dictionary.setProperty("you must select at least one column","You must select at least one column");
	    dictionary.setProperty("columns to export","Columns to export");
	    dictionary.setProperty("export type","Export format");

	    // import...
	    dictionary.setProperty("grid import","Grid Import");
	    dictionary.setProperty("file to import","File to import");
	    dictionary.setProperty("import","Import");
	    dictionary.setProperty("importmnemonic","M");
	    dictionary.setProperty("columns to import","Columns to import");
	    dictionary.setProperty("import type","Import format");
	    dictionary.setProperty("error while importing data","Error while importing data");
	    dictionary.setProperty("import completed","Import completed.");

	    // quick filter...
	    dictionary.setProperty("To value","To value");
	    dictionary.setProperty("Filter by","Filter by");
	    dictionary.setProperty("From value","From value");
	    dictionary.setProperty("equals","equals");
	    dictionary.setProperty("contains","contains");
	    dictionary.setProperty("starts with","starts with");
	    dictionary.setProperty("ends with","ends with");

	    // select/deselect all
	    dictionary.setProperty("select all","Select all");
	    dictionary.setProperty("deselect all","Deselect all");

	    // copy/cut/paste
	    dictionary.setProperty("copy","Copy");
	    dictionary.setProperty("copymnemonic","C");
	    dictionary.setProperty("cut","Cut");
	    dictionary.setProperty("cutmnemonic","U");
	    dictionary.setProperty("paste","Paste");
	    dictionary.setProperty("pastemnemonic","P");

	    // lookup...
	    dictionary.setProperty("Code is not correct.","Code is not correct.");
	    dictionary.setProperty("Code Validation","Code Validation");
	    dictionary.setProperty("Code Selection","Code Selection");

	    dictionary.setProperty("Caps lock pressed","Caps lock pressed");

	    // form...
	    dictionary.setProperty("Confirm deliting data?","Confirm deliting data?");
	    dictionary.setProperty("Error while saving: incorrect data.","Error while saving: incorrect data.");
	    dictionary.setProperty("Error while validating data:","Error while validating data:");
	    dictionary.setProperty("Validation Error","Validation Error");
	    dictionary.setProperty("Error on deleting:","Error on deleting:");
	    dictionary.setProperty("Error on Loading","Error on Loading");
	    dictionary.setProperty("Error while loading data:","Error while loading data:");
	    dictionary.setProperty("Error on setting value to the input control having the attribute name","Error on setting value to the input control having the attribute name");

	    // toolbar buttons...
	    dictionary.setProperty("Delete record (CTRL+D)","Delete record (CTRL+D)");
	    dictionary.setProperty("Edit record (CTRL+E)","Edit record (CTRL+E)");
	    dictionary.setProperty("New record (CTRL+I)","New record (CTRL+I)");
	    dictionary.setProperty("Reload record/Cancel current operation (CTRL+Z)","Reload record/Cancel current operation (CTRL+Z)");
	    dictionary.setProperty("Save record (CTRL+S)","Save record (CTRL+S)");
	    dictionary.setProperty("Copy record (CTRL+C)","Copy record (CTRL+C)");
	    dictionary.setProperty("Export record (CTRL+X)","Export records (CTRL+X)");
	    dictionary.setProperty("Import records (CTRL+M)","Import records (CTRL+M)");
	    dictionary.setProperty("Load the first block of records","Load the first block of records");
	    dictionary.setProperty("Select the previous row in grid","Select the previous row in grid");
	    dictionary.setProperty("Select the next row in grid","Select the next row in grid");
	    dictionary.setProperty("Load the previous block of records","Load the previous block of records");
	    dictionary.setProperty("Load the next block of records","Load the next block of records");
	    dictionary.setProperty("Load the last block of records","Load the last block of records");

	    dictionary.setProperty("Insert","Insert");
	    dictionary.setProperty("Edit","Edit");
	    dictionary.setProperty("Copy","Copy");
	    dictionary.setProperty("Delete","Delete");
	    dictionary.setProperty("Save","Save");
	    dictionary.setProperty("Reload","Reload");
	    dictionary.setProperty("Export","Export");
	    dictionary.setProperty("Filter","Filter");

	    // MDI Frame...
	    dictionary.setProperty("file","文件");
	    dictionary.setProperty("exit","退出");
	    dictionary.setProperty("filemnemonic","F");
	    dictionary.setProperty("exitmnemonic","E");
	    dictionary.setProperty("change user","Change User");
	    dictionary.setProperty("changeusermnemonic","U");
	    dictionary.setProperty("changelanguagemnemonic","L");
	    dictionary.setProperty("help","帮助");
	    dictionary.setProperty("about","关于");
	    dictionary.setProperty("helpmnemonic","H");
	    dictionary.setProperty("aboutmnemonic","A");
	    dictionary.setProperty("are you sure to quit application?","确定退出程序?");
	    dictionary.setProperty("quit application","退出程序");
	    dictionary.setProperty("forcegcmnemonic","F");
	    dictionary.setProperty("Force GC","Force GC");
	    dictionary.setProperty("Java Heap","Java Heap");
	    dictionary.setProperty("used","used");
	    dictionary.setProperty("allocated","allocated");
	    dictionary.setProperty("change language","Change Language");
	    dictionary.setProperty("changemnemonic","L");
	    dictionary.setProperty("cancelmnemonic","C");
	    dictionary.setProperty("cancel","取消");
	    dictionary.setProperty("yes","是");
	    dictionary.setProperty("no","否");
	    dictionary.setProperty("Functions","项目");
	    dictionary.setProperty("Error while executing function","Error while executing function");
	    dictionary.setProperty("Error","Error");
	    dictionary.setProperty("infoPanel","Info");
	    dictionary.setProperty("imageButton","About");
	    dictionary.setProperty("Window","窗口");
	    dictionary.setProperty("windowmnemonic","W");
	    dictionary.setProperty("Close All","关闭全部");
	    dictionary.setProperty("closeallmnemonic","A");
	    dictionary.setProperty("closemnemonic","C");
	    dictionary.setProperty("Press ENTER to find function","Press ENTER to find function");
	    dictionary.setProperty("Find Function","搜索");
	    dictionary.setProperty("Operation in progress...","Operation in progress...");
	    dictionary.setProperty("close window","关闭窗口");
	    dictionary.setProperty("reduce to icon","Reduce to icon");
	    dictionary.setProperty("save changes?", "Save changes?");
	    dictionary.setProperty("confirm window closing","Confirm window closing");
	    dictionary.setProperty("change background","Change background");
	    dictionary.setProperty("reset background","Reset background");

	    dictionary.setProperty("switch","切换");
	    dictionary.setProperty("switchmnemonic","S");
	    dictionary.setProperty("window name","窗口名");
	    dictionary.setProperty("opened windows","打开窗口");
	    dictionary.setProperty("tile horizontally","水平铺放");
	    dictionary.setProperty("tilehorizontallymnemonic","H");
	    dictionary.setProperty("tile vertically","竖直铺放");
	    dictionary.setProperty("tileverticallymnemonic","V");
	    dictionary.setProperty("cascade","层叠");
	    dictionary.setProperty("cascademnemonic","C");
	    dictionary.setProperty("minimize","最小化");
	    dictionary.setProperty("minimizemnemonic","M");
	    dictionary.setProperty("minimize all","最小化全部");
	    dictionary.setProperty("minimizeallmnemonic","A");
	    dictionary.setProperty("selected frame","选择窗口");

	    // server...
	    dictionary.setProperty("Client request not supported","Client request not supported");
	    dictionary.setProperty("User disconnected","User disconnected");
	    dictionary.setProperty("Updating not performed: the record was previously updated.","Updating not performed: the record was previously updated.");

	    // wizard...
	    dictionary.setProperty("back","后退");
	    dictionary.setProperty("next","前进");
	    dictionary.setProperty("finish","完成");

	    // image panel...
	    dictionary.setProperty("image selection","Image selection");

	    // tip of the day panel...
	    dictionary.setProperty("show 'tip of the day' after launching","Show 'tip of the day' after launching");
	    dictionary.setProperty("previous tip","Previous tip");
	    dictionary.setProperty("next tip","Next tip");
	    dictionary.setProperty("close","Close");
	    dictionary.setProperty("tip of the day","Tip of the day");
	    dictionary.setProperty("select tip","Select tip");
	    dictionary.setProperty("tip name","Tip name");
	    dictionary.setProperty("tips list","Tips list");

	    // progress panel...
	    dictionary.setProperty("progress","Progress");

	    // licence agreement...
	    dictionary.setProperty("i accept the terms in the licence agreement","I accept the terms in the licence agreement");
	    dictionary.setProperty("ok","Ok");
	    dictionary.setProperty("i do not accept the terms in the licence agreement","I do not accept the terms in the licence agreement");

	    // property grid control
	    dictionary.setProperty("property name","Name");
	    dictionary.setProperty("property value","Value");

	    // grid profile
	    dictionary.setProperty("grid profile management","Grid profile management");
	    dictionary.setProperty("restore default grid profile","Restore default grid profile");
	    dictionary.setProperty("create new grid profile","Create new grid profile");
	    dictionary.setProperty("profile description","Profile description");
	    dictionary.setProperty("remove current grid profile","Remove current grid profile");
	    dictionary.setProperty("select grid profile","Select grid profile");
	    dictionary.setProperty("default profile","Default profile");

	    // search box
	    dictionary.setProperty("search","搜索");
	    dictionary.setProperty("not found","未找到");

	    // drag...
	    dictionary.setProperty("drag","Drag");

	    // pivot table...
	    dictionary.setProperty("pivot table settings","Pivot table settings");
	    dictionary.setProperty("row fields","Row fields");
	    dictionary.setProperty("column fields","Column fields");
	    dictionary.setProperty("data fields","Data fields");
	    dictionary.setProperty("filtering conditions","Filtering conditions");
	    dictionary.setProperty("field","Field");
	    dictionary.setProperty("checked","Checked");
	    dictionary.setProperty("at least one data field must be selected","At least one data field must be selected.");
	    dictionary.setProperty("at least one row field must be selected","At least one row field must be selected.");
	    dictionary.setProperty("at least one column field must be selected","At least one column field must be selected.");
	    dictionary.setProperty("expand all","Expand all");
	    dictionary.setProperty("collapse all","Collapse all");

	    dictionary.setProperty(Consts.EQ,"Equals to");
	    dictionary.setProperty(Consts.GE,"Greater or equals to");
	    dictionary.setProperty(Consts.GT,"Greater than");
	    dictionary.setProperty(Consts.IS_NOT_NULL,"Is filled");
	    dictionary.setProperty(Consts.IS_NULL,"Is not filled");
	    dictionary.setProperty(Consts.LE,"Less or equals to");
	    dictionary.setProperty(Consts.LIKE,"Contains");
	    dictionary.setProperty(Consts.LT,"Less than");
	    dictionary.setProperty(Consts.NEQ,"Not equals to");
	    dictionary.setProperty(Consts.IN,"Contains values");
	    dictionary.setProperty(Consts.ASC_SORTED,"Ascending");
	    dictionary.setProperty(Consts.DESC_SORTED,"Descending");
	    dictionary.setProperty(Consts.NOT_IN,"Not contains values");
	  	//*/
	    
	    resources = new Resources(
	      dictionary,
	      currencySymbol,
	      '.',
	      ',',
	      Resources.YMD,
	      true,
	      dateFormatSeparator,
	      "HH:mm",
	      "EN",
	      showResourceNotFoundWarning
	    );
	  }


	  /**
	   * @return internationalization settings, according with the current language
	   */
	  public final Resources getResources() {
	    return resources;
	  }


	  /**
	   * Load dictionary, according to the specified language id.
	   * @param langId language id identifier
	   */
	  public final void setLanguage(String langId) throws UnsupportedOperationException {
	    if (!resources.getLanguageId().equals(langId))
	      throw new UnsupportedOperationException("Language identifier not supported.");
	  }


	  /**
	   * @param langId language id identifier
	   * @return internationalization settings, according with the language specified
	   */
	  public final Resources getResources(String langId) throws UnsupportedOperationException {
	    if (!resources.getLanguageId().equals(langId))
	    throw new UnsupportedOperationException("Language identifier not supported.");
	    return resources;
	  }



	}
