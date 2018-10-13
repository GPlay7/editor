package best.toukir.photoedit;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import ly.img.android.ImgLySdk;


public class Application extends android.app.Application {

//    private InterstitialAd interstitialAd;

    @Override
    public void onCreate() {
        super.onCreate();
//
//        interstitialAd = new InterstitialAd(this);
//        interstitialAd.setAdUnitId("ca-app-pub-9590663615277504/6901301877");
//        AdRequest request = new AdRequest.Builder().build();
//
//        interstitialAd.loadAd(request);
//
//        interstitialAd.setAdListener(new AdListener() {
//            @Override
//            public void onAdLoaded() {
//                showInterstitial();
//            }
//        });

        ImgLySdk.init(this);
    }
//    private void showInterstitial() {
//        if (interstitialAd.isLoaded()) {
//            interstitialAd.show();
//        }
//    }

}
