import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;

final class fj implements CommandListener {
   private final TextBox a;
   private final fi a;

   fj(fi var1, TextBox var2) {
      this.a = var1;
      this.a = var2;
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1.getLabel().equals(gk.a(6))) {
         this.a.b(this.a.getString());
      }

      bc.a.b();
   }
}
