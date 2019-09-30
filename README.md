# Yt-Android-API
playing a video or a list of videos or a playlist from youtube using Youtube Android player API
# com.google.android.youtube.player
This package contains all the interfaces and classes of the YouTube Android Player API. This API enables you to easily play YouTube videos and display thumbnails of YouTube videos in your Android application.

There are two ways to play videos. The first option is to place a YouTubePlayerFragment or YouTubePlayerView in your View hierarchy and then use the YouTubePlayer to control video playback in the View. This gives a fine control of the experience. For example, you can decide the size of the video, listen to events from the player and control the playback.

The second option is to use the YouTubeStandalonePlayer which will start video playback in a separate activity. This is simpler to use, however it gives you less flexibility and control over video playback. The StandalonePlayer supports two modes, either fullscreen or lightbox. In lightbox mode, the activity launching the player is still visible behind the player, slightly dimmed.

To display YouTube thumbnails, place a YouTubeThumbnailView in your view hierarchy and then use the YouTubeThumbnailLoader to load a single video thumbnail or a whole playlist.

The API is distributed together with a set of samples that give some examples of how to use specific parts, see the 'sample' directory in the distributed zip file.
