package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override   
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        String page = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "\t<head>\n" +
                "\t\t<meta charset=\"utf-8\">\n" +
                "\t\t<title>Fargo 404</title>\n" +
                "\t\t<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Dosis:400,300,500,800\">\n" +
                "\t\t<style type=\"text/css\">\n" +
                "\t\t\thtml,\n" +
                "\t\t\tbody {\n" +
                "\t\t\t  height: 100%;\n" +
                "\t\t\t  min-height: 450px;\n" +
                "\t\t\t  font-family: \"Dosis\", sans-serif;\n" +
                "\t\t\t  font-size: 32px;\n" +
                "\t\t\t  font-weight: 500;\n" +
                "\t\t\t  color: #5d7399;\n" +
                "\t\t\t}\n" +
                "\t\t\t\n" +
                "\t\t\t.content {\n" +
                "\t\t\t  height: 100%;\n" +
                "\t\t\t  position: relative;\n" +
                "\t\t\t  z-index: 1;\n" +
                "\t\t\t  background-color: #d2e1ec;\n" +
                "\t\t\t  background-image: linear-gradient(to bottom, #bbcfe1 0%, #e8f2f6 80%);\n" +
                "\t\t\t  overflow: hidden;\n" +
                "\t\t\t}\n" +
                "\t\t\t\n" +
                "\t\t\t.snow {\n" +
                "\t\t\t  position: absolute;\n" +
                "\t\t\t  top: 0;\n" +
                "\t\t\t  left: 0;\n" +
                "\t\t\t  pointer-events: none;\n" +
                "\t\t\t  z-index: 20;\n" +
                "\t\t\t}\n" +
                "\t\t\t\n" +
                "\t\t\t.main-text {\n" +
                "\t\t\t  padding: 20vh 20px 0 20px;\n" +
                "\t\t\t  text-align: center;\n" +
                "\t\t\t  line-height: 2em;\n" +
                "\t\t\t  font-size: 5vh;\n" +
                "\t\t\t}\n" +
                "\t\t\t\n" +
                "\t\t\t.home-link {\n" +
                "\t\t\t  font-size: 0.6em;\n" +
                "\t\t\t  font-weight: 400;\n" +
                "\t\t\t  color: inherit;\n" +
                "\t\t\t  text-decoration: none;\n" +
                "\t\t\t  opacity: 0.6;\n" +
                "\t\t\t  border-bottom: 1px dashed rgba(93, 115, 153, 0.5);\n" +
                "\t\t\t}\n" +
                "\t\t\t.home-link:hover {\n" +
                "\t\t\t  opacity: 1;\n" +
                "\t\t\t}\n" +
                "\t\t\t\n" +
                "\t\t\t.ground {\n" +
                "\t\t\t  height: 160px;\n" +
                "\t\t\t  width: 100%;\n" +
                "\t\t\t  position: absolute;\n" +
                "\t\t\t  bottom: 0;\n" +
                "\t\t\t  left: 0;\n" +
                "\t\t\t  background: #f6f9fa;\n" +
                "\t\t\t  box-shadow: 0 0 10px 10px #f6f9fa;\n" +
                "\t\t\t}\n" +
                "\t\t\t.ground:before, .ground:after {\n" +
                "\t\t\t  content: \"\";\n" +
                "\t\t\t  display: block;\n" +
                "\t\t\t  width: 250px;\n" +
                "\t\t\t  height: 250px;\n" +
                "\t\t\t  position: absolute;\n" +
                "\t\t\t  top: -62.5px;\n" +
                "\t\t\t  z-index: -1;\n" +
                "\t\t\t  background: transparent;\n" +
                "\t\t\t  transform: scaleX(0.2) rotate(45deg);\n" +
                "\t\t\t}\n" +
                "\t\t\t.ground:after {\n" +
                "\t\t\t  left: 50%;\n" +
                "\t\t\t  margin-left: -166.6666666667px;\n" +
                "\t\t\t  box-shadow: -340px 260px 15px #bac4d5, -625px 575px 15px #91a1bc, -855px 945px 15px #7e90b0, -1165px 1235px 15px #b0bccf, -1470px 1530px 15px #94a3be, -1750px 1850px 15px #91a1bc, -2145px 2055px 15px #b0bccf, -2400px 2400px 15px #7e90b0, -2665px 2735px 15px #a7b4c9, -2965px 3035px 15px #8496b4, -3260px 3340px 15px #94a3be, -3580px 3620px 15px #97a6c0, -3885px 3915px 15px #9aa9c2, -4160px 4240px 15px #8193b2, -4470px 4530px 15px #8e9eba, -4845px 4755px 15px #7e90b0;\n" +
                "\t\t\t}\n" +
                "\t\t\t.ground:before {\n" +
                "\t\t\t  right: 50%;\n" +
                "\t\t\t  margin-right: -166.6666666667px;\n" +
                "\t\t\t  box-shadow: 260px -340px 15px #b0bccf, 630px -570px 15px #a1aec6, 925px -875px 15px #94a3be, 1170px -1230px 15px #a7b4c9, 1535px -1465px 15px #a7b4c9, 1845px -1755px 15px #8a9bb8, 2150px -2050px 15px #b7c1d3, 2445px -2355px 15px #8798b6, 2735px -2665px 15px #bac4d5, 3015px -2985px 15px #94a3be, 3270px -3330px 15px #b7c1d3, 3620px -3580px 15px #8193b2, 3860px -3940px 15px #9dabc4, 4215px -4185px 15px #8798b6, 4485px -4515px 15px #8e9eba, 4810px -4790px 15px #bac4d5;\n" +
                "\t\t\t}\n" +
                "\t\t\t\n" +
                "\t\t\t.mound {\n" +
                "\t\t\t  margin-top: -80px;\n" +
                "\t\t\t  font-weight: 800;\n" +
                "\t\t\t  font-size: 180px;\n" +
                "\t\t\t  text-align: center;\n" +
                "\t\t\t  color: #dd4040;\n" +
                "\t\t\t  pointer-events: none;\n" +
                "\t\t\t}\n" +
                "\t\t\t.mound:before {\n" +
                "\t\t\t  content: \"\";\n" +
                "\t\t\t  display: block;\n" +
                "\t\t\t  width: 600px;\n" +
                "\t\t\t  height: 200px;\n" +
                "\t\t\t  position: absolute;\n" +
                "\t\t\t  left: 50%;\n" +
                "\t\t\t  margin-left: -300px;\n" +
                "\t\t\t  top: 50px;\n" +
                "\t\t\t  z-index: 1;\n" +
                "\t\t\t  border-radius: 100%;\n" +
                "\t\t\t  background-color: #e8f2f6;\n" +
                "\t\t\t  background-image: linear-gradient(to bottom, #dee8f1, #f6f9fa 60px);\n" +
                "\t\t\t}\n" +
                "\t\t\t.mound:after {\n" +
                "\t\t\t  content: \"\";\n" +
                "\t\t\t  display: block;\n" +
                "\t\t\t  width: 28px;\n" +
                "\t\t\t  height: 6px;\n" +
                "\t\t\t  position: absolute;\n" +
                "\t\t\t  left: 50%;\n" +
                "\t\t\t  margin-left: -150px;\n" +
                "\t\t\t  top: 68px;\n" +
                "\t\t\t  z-index: 2;\n" +
                "\t\t\t  background: #dd4040;\n" +
                "\t\t\t  border-radius: 100%;\n" +
                "\t\t\t  transform: rotate(-15deg);\n" +
                "\t\t\t  box-shadow: -56px 12px 0 1px #dd4040, -126px 6px 0 2px #dd4040, -196px 24px 0 3px #dd4040;\n" +
                "\t\t\t}\n" +
                "\t\t\t\n" +
                "\t\t\t.mound_text {\n" +
                "\t\t\t  transform: rotate(6deg);\n" +
                "\t\t\t}\n" +
                "\t\t\t\n" +
                "\t\t\t.mound_spade {\n" +
                "\t\t\t  display: block;\n" +
                "\t\t\t  width: 35px;\n" +
                "\t\t\t  height: 30px;\n" +
                "\t\t\t  position: absolute;\n" +
                "\t\t\t  right: 50%;\n" +
                "\t\t\t  top: 42%;\n" +
                "\t\t\t  margin-right: -250px;\n" +
                "\t\t\t  z-index: 0;\n" +
                "\t\t\t  transform: rotate(35deg);\n" +
                "\t\t\t  background: #dd4040;\n" +
                "\t\t\t}\n" +
                "\t\t\t.mound_spade:before, .mound_spade:after {\n" +
                "\t\t\t  content: \"\";\n" +
                "\t\t\t  display: block;\n" +
                "\t\t\t  position: absolute;\n" +
                "\t\t\t}\n" +
                "\t\t\t.mound_spade:before {\n" +
                "\t\t\t  width: 40%;\n" +
                "\t\t\t  height: 30px;\n" +
                "\t\t\t  bottom: 98%;\n" +
                "\t\t\t  left: 50%;\n" +
                "\t\t\t  margin-left: -20%;\n" +
                "\t\t\t  background: #dd4040;\n" +
                "\t\t\t}\n" +
                "\t\t\t.mound_spade:after {\n" +
                "\t\t\t  width: 100%;\n" +
                "\t\t\t  height: 30px;\n" +
                "\t\t\t  top: -55px;\n" +
                "\t\t\t  left: 0%;\n" +
                "\t\t\t  box-sizing: border-box;\n" +
                "\t\t\t  border: 10px solid #dd4040;\n" +
                "\t\t\t  border-radius: 4px 4px 20px 20px;\n" +
                "\t\t\t}\n" +
                "\t\t</style>\n" +
                "\t</head>\n" +
                "\t<body>\t\n" +
                "\t\t<div class=\"content\">\n" +
                "\t\t  <canvas class=\"snow\" id=\"snow\"></canvas>\n" +
                "\t\t  <div class=\"main-text\">\n" +
                "\t\t    <h1>Aw jeez.<br/>That page has gone missing.</h1><a class=\"home-link\" href=\"http://haiyongcsdn.gitee.io/n404/\">Hitch a ride back home.</a>\n" +
                "\t\t  </div>\n" +
                "\t\t  <div class=\"ground\">\n" +
                "\t\t    <div class=\"mound\"> \n" +
                "\t\t      <div class=\"mound_text\">404</div>\n" +
                "\t\t      <div class=\"mound_spade\"></div>\n" +
                "\t\t    </div>\n" +
                "\t\t  </div>\n" +
                "\t\t</div>\n" +
                "\t\t<script type=\"text/javascript\">\n" +
                "\t\t\t(function() {\n" +
                "\t\t\t\tfunction ready(fn) {\n" +
                "\t\t\t\t\tif (document.readyState != 'loading'){\n" +
                "\t\t\t\t\t\tfn();\n" +
                "\t\t\t\t\t} else {\n" +
                "\t\t\t\t\t\tdocument.addEventListener('DOMContentLoaded', fn);\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t}\n" +
                "\t\t\t\t\n" +
                "\t\t\t\tfunction makeSnow(el) {\n" +
                "\t\t\t\t\tvar ctx = el.getContext('2d');\n" +
                "\t\t\t\t\tvar width = 0;\n" +
                "\t\t\t\t\tvar height = 0;\n" +
                "\t\t\t\t\tvar particles = [];\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\tvar Particle = function() {\n" +
                "\t\t\t\t\t\tthis.x = this.y = this.dx = this.dy = 0;\n" +
                "\t\t\t\t\t\tthis.reset();\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\tParticle.prototype.reset = function() {\n" +
                "\t\t\t\t\t\tthis.y = Math.random() * height;\n" +
                "\t\t\t\t\t\tthis.x = Math.random() * width;\n" +
                "\t\t\t\t\t\tthis.dx = (Math.random() * 1) - 0.5;\n" +
                "\t\t\t\t\t\tthis.dy = (Math.random() * 0.5) + 0.5;\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\tfunction createParticles(count) {\n" +
                "\t\t\t\t\t\tif (count != particles.length) {\n" +
                "\t\t\t\t\t\t\tparticles = [];\n" +
                "\t\t\t\t\t\t\tfor (var i = 0; i < count; i++) {\n" +
                "\t\t\t\t\t\t\t\tparticles.push(new Particle());\n" +
                "\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\tfunction onResize() {\n" +
                "\t\t\t\t\t\twidth = window.innerWidth;\n" +
                "\t\t\t\t\t\theight = window.innerHeight;\n" +
                "\t\t\t\t\t\tel.width = width;\n" +
                "\t\t\t\t\t\tel.height = height;\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\tcreateParticles((width * height) / 10000);\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\tfunction updateParticles() {\n" +
                "\t\t\t\t\t\tctx.clearRect(0, 0, width, height);\n" +
                "\t\t\t\t\t\tctx.fillStyle = '#f6f9fa';\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\tparticles.forEach(function(particle) {\n" +
                "\t\t\t\t\t\t\tparticle.y += particle.dy;\n" +
                "\t\t\t\t\t\t\tparticle.x += particle.dx;\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\tif (particle.y > height) {\n" +
                "\t\t\t\t\t\t\t\tparticle.y = 0;\n" +
                "\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\tif (particle.x > width) {\n" +
                "\t\t\t\t\t\t\t\tparticle.reset();\n" +
                "\t\t\t\t\t\t\t\tparticle.y = 0;\n" +
                "\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\tctx.beginPath();\n" +
                "\t\t\t\t\t\t\tctx.arc(particle.x, particle.y, 5, 0, Math.PI * 2, false);\n" +
                "\t\t\t\t\t\t\tctx.fill();\n" +
                "\t\t\t\t\t\t});\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\twindow.requestAnimationFrame(updateParticles);\n" +
                "\t\t\t\t\t}\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\tonResize();\n" +
                "\t\t\t\t\tupdateParticles();\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\twindow.addEventListener('resize', onResize);\n" +
                "\t\t\t\t}\n" +
                "\t\t\t\t\n" +
                "\t\t\t\tready(function() {\n" +
                "\t\t\t\t\tvar canvas = document.getElementById('snow');\n" +
                "\t\t\t\t\tmakeSnow(canvas);\n" +
                "\t\t\t\t});\n" +
                "\t\t\t})();\n" +
                "\t\t</script>\n" +
                "\t</body>\n" +
                "</html>\n";
        resp.getWriter().write(page);
    }
}
