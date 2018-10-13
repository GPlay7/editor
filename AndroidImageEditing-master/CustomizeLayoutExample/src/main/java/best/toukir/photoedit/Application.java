package best.toukir.photoedit;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import ly.img.android.ImgLySdk;


public class Application extends android.app.Application {
//
//    private AdView mAdview;
//    private InterstitialAd mInterStitialAd;

    @Override
    public void onCreate() {
        super.onCreate();
//
//        mInterStitialAd = new InterstitialAd(this);
//        mInterStitialAd.setAdUnitId("ca-app-pub-9590663615277504/6901301877");
//        AdRequest iAdRequest = new AdRequest.Builder().build();
//
//        mInterStitialAd.loadAd(iAdRequest);
//
//        mInterStitialAd.setAdListener(new AdListener() {
//            @Override
//            public void onAdLoaded() {
//                showInterstitial();
//            }
//        });


        ImgLySdk.init(this);


    }

//    private void showInterstitial() {
//        if (mInterStitialAd.isLoaded()) {
//            mInterStitialAd.show();
//        }
//    }
}
