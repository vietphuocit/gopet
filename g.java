import javax.microedition.lcdui.Image;

public class g implements gp {
   public byte a = -1;
   public String a;
   public String b;
   public String c;
   public String d;
   public byte b;
   private String e;

   public g(byte var1) {
      this.b = var1;
   }

   public final Image a() {
      return bc.b <= 128 ? null : v.f;
   }

   public final String a() {
      return this.a;
   }

   public final String b() {
      if (this.e == null) {
         switch(this.b) {
         case 0:
            StringBuffer var1 = (new StringBuffer(c.a(344))).append(this.b).append(" ");
            this.e = var1.append(eu.c).append(" ").append(bc.a.a.getAppProperty("RefCode")).append(c.a(441)).append(this.c).toString();
            break;
         case 1:
            this.e = c.a(212);
            break;
         case 2:
            this.e = c.a(213);
         case 3:
         case 4:
         case 5:
         default:
            break;
         case 6:
            this.e = c.a(185);
            break;
         case 7:
            this.e = c.a(186);
            break;
         case 8:
            this.e = c.a(596);
            break;
         case 9:
            this.e = "Đổi vàng lấy ngọc";
         }
      }

      return this.e;
   }
}
