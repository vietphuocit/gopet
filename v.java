import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class v {
   public static String a = "/avatar.dat";
   public static Image[] a;
   public static Image[] b;
   private static fl f;
   public static fl a;
   public static fl b;
   public static fl c;
   public static fl d;
   public static fl e;
   private static fl g;
   private static fl h;
   private static fl i;
   public static Image a;
   public static Image b;
   public static Image c;
   public static Image d;
   public static Image e;
   public static Image f;
   public static Image g;
   public static Image h;
   public static Image i;
   public static Image j;
   public static Image k;
   public static Image l;
   public static Image m;
   private static Hashtable a = new Hashtable();
   private static Hashtable b = new Hashtable();
   private static Vector a = new Vector();
   private static Image n;

   public static void a() {
      gi.a("/common.dat");
      gs var0 = new gs(gi.a(18), 3);
      a = new Image[3];

      int var1;
      for(var1 = 0; var1 < 3; ++var1) {
         a[var1] = var0.a(var1);
      }

      a = gi.a(24);
      b = gi.a(14);
      c = gi.a(21);
      d = gi.a(7);
      f = Image.createImage(e = gi.a(17), e.getWidth() - 14, 0, 14, 14, 0);
      g = gi.a(22);
      var0 = new gs(gi.a(23), 4);
      b = new Image[4];

      for(var1 = 0; var1 < 4; ++var1) {
         b[var1] = var0.a(var1);
      }

      h = gi.a(3);
      i = gi.a(6);
      j = gi.a(16);
      k = gi.a(0);
      l = gi.a(1);
      du.a();
   }

   static void b() {
      b = new fl(gj.b, 0, -12887656);
      a = new fl(gj.a, 0, -256);
      d = new fl(gj.a, 0, -12887656);
      c = new fl(gj.b, 0, -1);
      f = new fl(d(), -1, -1508019);
      e = new fl(gj.a, 0, -65536);
   }

   public static fl a() {
      if (f == null) {
         f = new fl(d(), -1, -1508019);
      }

      return f;
   }

   public static fl b() {
      if (i == null) {
         i = new fl(" 0123456789.,:!?()-'/ABCDEFGHIJKLMNOPQRSTUVWXYZÁÀẢÃẠĂẮẰẲẴẶÂẤẦẨẪẬÉÈẺẼẸÊẾỀỂỄỆÍÌỈĨỊÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢÚÙỦŨỤƯỨỪỬỮỰÝỲỶỸỴĐ", new byte[]{4, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 4, 4, 4, 4, 8, 6, 6, 6, 3, 7, 10, 10, 10, 10, 8, 8, 10, 10, 5, 8, 9, 8, 13, 11, 10, 10, 10, 10, 10, 9, 10, 10, 13, 11, 11, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 5, 5, 5, 5, 5, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, 20, gi.a("/common.dat", 5), 0);
      }

      return i;
   }

   public static fl c() {
      if (h == null) {
         h = new fl(" 0123456789.,:!?()+*$#/-%abcdefghijklmnopqrstuvwxyzáàảãạăắằẳẵặâấầẩẫậéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữựýỳỷỹỵđABCDEFGHIJKLMNOPQRSTUVWXYZĐ~Ớ", new byte[]{4, 7, 6, 7, 7, 8, 7, 7, 7, 7, 7, 4, 4, 4, 5, 6, 5, 5, 7, 6, 9, 9, 7, 7, 11, 7, 8, 6, 8, 7, 5, 8, 8, 4, 5, 7, 4, 10, 8, 8, 8, 8, 6, 6, 5, 8, 7, 10, 7, 8, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 7, 4, 4, 4, 6, 4, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 8, 8, 8, 8, 9, 8, 8, 8, 8, 8, 7, 7, 8, 8, 4, 6, 8, 7, 11, 9, 8, 8, 8, 7, 8, 8, 8, 8, 10, 8, 8, 9, 9, 7, 8}, 15, gi.a("/common.dat", 4), -1);
      }

      return h;
   }

   public static fl d() {
      if (g == null) {
         g = new fl(" 0123456789.+-%$:ABCDEFGHIJKLMNOPQRSTUVWXYZ/", new byte[]{3, 5, 3, 5, 5, 5, 5, 5, 5, 5, 5, 4, 5, 5, 7, 5, 3, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7, 6, 5, 5, 5, 5, 5, 5, 5, 5, 7, 5, 5, 5, 7}, 8, gi.a("/common.dat", 9), -1);
      }

      return g;
   }

   public static fl a(int var0) {
      Integer var1 = new Integer(var0);
      fl var2;
      if ((var2 = (fl)a.get(var1)) != null) {
         return var2;
      } else {
         var2 = new fl(d(), -1, var0);
         a.put(var1, var2);
         return var2;
      }
   }

   public static void c() {
      a.clear();
   }

   public static Image a() {
      if (n == null) {
         Graphics var0;
         (var0 = (n = Image.createImage(1, 1)).getGraphics()).setColor(128, 128, 128);
         var0.fillRect(0, 0, 10, 10);
      }

      return n;
   }

   public static void d() {
      b.clear();
   }

   public static Image a(String var0, byte var1) {
      String var2 = "gui" + var1 + "_" + var0;
      Image var3;
      if ((var3 = (Image)b.get(var2)) != null) {
         return var3;
      } else {
         if (!a.contains(var2)) {
            eu.a(var0, var1);
            a.addElement(var2);
         }

         return null;
      }
   }

   public static void a(String var0, Image var1, byte var2) {
      var0 = "gui" + var2 + "_" + var0;
      b.put(var0, var1);
      a.removeElement(var0);
   }

   public static fl a(byte var0) {
      switch(var0) {
      case 0:
         return gj.a;
      case 1:
         return gj.b;
      case 2:
         return a();
      case 3:
         return b();
      case 4:
         return d();
      case 5:
         return c();
      case 6:
         return b;
      case 7:
         return a;
      case 8:
         return d;
      case 9:
         return c;
      case 10:
         return e;
      default:
         return null;
      }
   }
}
