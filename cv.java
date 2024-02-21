import java.io.IOException;
import javax.microedition.lcdui.Image;

final class cv extends da {
   private final cu a;

   public cv(cu var1, int var2) {
      super((Image)null);
      this.a = var1;
      this.c = (byte)var2;
   }

   public final void a() {
      bc.a.translate(this.r, this.s);
      bc.a.setColor(gg.b);
      bc.a.fillRoundRect(0, 0, this.t, this.u, 10, 10);
      switch(cu.a(this.a)[this.c]) {
      case -1:
         if (cu.a(this.a) == null) {
            try {
               cu.a(this.a, Image.createImage("/lock.png"));
            } catch (IOException var2) {
               var2.printStackTrace();
            }
         }

         bc.a.drawImage(cu.a(this.a), -1, -4, 0);
         break;
      case 1:
         Image var1;
         if ((var1 = br.a.a(cu.a(this.a)[this.c])) != null) {
            bc.a.drawImage(var1, -1, this.u >> 1, 6);
            if (cu.b(this.a)[this.c] != null) {
               gj.a.a(bc.a, cu.b(this.a)[this.c], var1.getWidth() + 2, 3, 20);
            }
         }
      }

      bc.a.translate(-this.r, -this.s);
   }

   public final void a_() {
      super.a_();
      cu.a(this.a, this.c);
      if (cu.a(this.a)[this.c] == 1) {
         cu.a(this.a, gj.a.a(cu.c(this.a)[this.c], bc.b - 25));
      } else {
         cu.a(this.a, (String[])null);
      }
   }
}
