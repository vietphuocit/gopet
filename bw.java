import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import javax.microedition.lcdui.Image;

public final class bw {
   public Hashtable a = new Hashtable();
   private Image a = Image.createImage(1, 1);
   private Hashtable b = new Hashtable();

   final void a(String var1, byte[] var2) {
      Image var3;
      if ((var3 = Image.createImage(var2, 0, var2.length)) != null) {
         this.a.put(var1, var3);
      }

   }

   public final Image a(String var1) {
      Image var2;
      if ((var2 = (Image)this.a.get(var1)) == null) {
         bf.a(var1, 1);
         this.a.put(var1, this.a);
         return null;
      } else {
         return var2 != this.a ? var2 : null;
      }
   }

   public final void a(String var1) {
      this.a.remove(var1);
   }

   public static gb[] a(String var0) {
      Image var1 = null;

      try {
         var1 = Image.createImage(var0 + ".png");
      } catch (IOException var3) {
         var3.printStackTrace();
      }

      gc var2 = new gc();
      InputStream var4 = gj.a(var0);
      var2.a(new DataInputStream(var4));

      for(int var5 = 0; var5 < var2.a.length; ++var5) {
         var2.a[var5].a = var1;
      }

      gb[] var6 = new gb[var2.a.length];

      for(int var7 = 0; var7 < var6.length; ++var7) {
         var6[var7] = new gb(var2.a[var7]);
      }

      return var6;
   }

   final void b(String var1, byte[] var2) {
      Image var3;
      if ((var3 = Image.createImage(var2, 0, var2.length)) != null) {
         this.b.put(var1, var3);
      }

   }

   public final Image b(String var1) {
      Image var2;
      if ((var2 = (Image)this.b.get(var1)) == null) {
         bf.a(var1, 2);
         this.b.put(var1, this.a);
         return null;
      } else {
         return var2 != this.a ? var2 : null;
      }
   }
}
