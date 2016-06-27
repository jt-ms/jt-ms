<%--
  Created by IntelliJ IDEA.
  User: cutesimba
  Date: 16/6/26
  Time: 下午5:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/nivo-slider.css" rel="stylesheet">
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery-1.9.0.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.nivo.slider.pack.js"></script>
</head>
<body>
    <div class="slider-wrapper theme-default">
    <div class="ribbon"></div>
    <div id="slider" class="nivoSlider">
        <img src="images/pig1.jpg" alt=""/>
        <a href="#"><img src="images/pig2.jpg" alt="" title="This is an example of a caption"/></a>
        <img src="images/pig3.jpg" alt="" data-transition="slideInLeft"/>
        <img src="images/pig4.jpg" alt="" title="#htmlcaption"/>
    </div>
    <div id="htmlcaption" class="nivo-html-caption">
        <strong>This</strong> is an example of a <em>HTML</em> caption with <a href="#">a link</a>.
    </div>
</div>
</body>
<script type="text/javascript">
    $(function () {
        $('#slider').nivoSlider({
            effect: 'random', // Specify sets like: 'fold,fade,sliceDown'
            slices: 15, // For slice animations
            boxCols: 8, // For box animations
            boxRows: 4, // For box animations
            animSpeed: 500, // Slide transition speed
            pauseTime: 3000, // How long each slide will show
            startSlide: 0, // Set starting Slide (0 index)
            directionNav: true, // Next & Prev navigation
            directionNavHide: true, // Only show on hover
            controlNav: true, // 1,2,3... navigation
            controlNavThumbs: false, // Use thumbnails for Control Nav
            controlNavThumbsFromRel: false, // Use image rel for thumbs
            controlNavThumbsSearch: '.jpg', // Replace this with...
            controlNavThumbsReplace: '_thumb.jpg', // ...this in thumb Image src
            keyboardNav: true, // Use left & right arrows
            pauseOnHover: true, // Stop animation while hovering
            manualAdvance: false, // Force manual transitions
            captionOpacity: 0.8, // Universal caption opacity
            prevText: 'Prev', // Prev directionNav text
            nextText: 'Next', // Next directionNav text
            randomStart: false, // Start on a random slide
            beforeChange: function(){}, // Triggers before a slide transition
            afterChange: function(){}, // Triggers after a slide transition
            slideshowEnd: function(){}, // Triggers after all slides have been shown
            lastSlide: function(){}, // Triggers when last slide is shown
            afterLoad: function(){} // Triggers when slider has loaded
        });
    });
</script>
</html>
