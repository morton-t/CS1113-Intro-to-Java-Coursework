public class CallPlaylistSong {
   public static void main(String[] args) {
      PlaylistSong headObj = null;
      PlaylistSong firstSong = null;
      PlaylistSong secondSong = null;
      PlaylistSong thirdSong = null;
      PlaylistSong currObj = null;

      headObj = new PlaylistSong("head");

      firstSong = new PlaylistSong("Lacrimosa");
      headObj.InsertAfter(firstSong);

      secondSong = new PlaylistSong("Vocalise");
      firstSong.InsertAfter(secondSong);

      thirdSong = new PlaylistSong("Canon");
      secondSong.InsertAfter(thirdSong);

      currObj = headObj;

      while (currObj != null) {
         currObj.PrintNodeData();
         currObj = currObj.GetNext();
      }
   }
}