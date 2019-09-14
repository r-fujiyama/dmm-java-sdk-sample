package sample;

import com.sdk.java.dmm.api.actress.ActressSearch;
import com.sdk.java.dmm.api.actress.dto.ActressSearchResult;
import com.sdk.java.dmm.api.author.AuthorSearch;
import com.sdk.java.dmm.api.author.dto.AuthorSearchResult;
import com.sdk.java.dmm.api.floor.FloorSearch;
import com.sdk.java.dmm.api.floor.dto.FloorSearchResult;
import com.sdk.java.dmm.api.genre.GenreSearch;
import com.sdk.java.dmm.api.genre.dto.GenreSearchResult;
import com.sdk.java.dmm.api.item.ItemSearch;
import com.sdk.java.dmm.api.item.dto.ItemSearchResult;
import com.sdk.java.dmm.api.maker.MakerSearch;
import com.sdk.java.dmm.api.maker.dto.MakerSearchResult;
import com.sdk.java.dmm.api.series.SeriesSearch;
import com.sdk.java.dmm.api.series.dto.SeriesSearchResult;
import com.sdk.java.dmm.enums.Site;

/**
 * 「API_ID」「AFFILIATE_ID」は自身がDMMに申請し取得した値を使用してください。<br>
 * https://affiliate.dmm.com/api/
 */
public class Sample {

  public static void main(String args[]) {
    // 商品検索
    ItemSearch itemSearch = new ItemSearch("API_ID", "AFFILIATE_ID");
    itemSearch.setSite(Site.DMM);
    ItemSearchResult itemSearchResult = itemSearch.execute();

    // 女優検索
    ActressSearch actressSearch = new ActressSearch("API_ID", "AFFILIATE_ID");
    actressSearch.setKeyword("みかみゆあ");
    ActressSearchResult actressSearchResult = actressSearch.execute();

    // ジャンル検索
    GenreSearch genreSearch = new GenreSearch("API_ID", "AFFILIATE_ID");
    genreSearch.setFloorId("19");
    GenreSearchResult genreSearchResult = genreSearch.execute();

    // メーカー検索
    MakerSearch makerSearch = new MakerSearch("API_ID", "AFFILIATE_ID");
    makerSearch.setFloorId("25");
    MakerSearchResult makerSearchResult = makerSearch.execute();

    // シリーズ検索
    SeriesSearch seriesSearch = new SeriesSearch("API_ID", "AFFILIATE_ID");
    seriesSearch.setFloorId("25");
    SeriesSearchResult seriesSearchResult = seriesSearch.execute();

    // 作者検索
    AuthorSearch authorSearch = new AuthorSearch("API_ID", "AFFILIATE_ID");
    authorSearch.setFloorId("25");
    AuthorSearchResult authorSearchResult = authorSearch.execute();

    // フロア検索
    FloorSearch floorSearch = new FloorSearch("API_ID", "AFFILIATE_ID");
    FloorSearchResult floorSearchResult = floorSearch.execute();
  }
}
