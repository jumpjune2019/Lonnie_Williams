document.addEventListener("DOMContentLoaded", function() {
    var go = document.getElementById("go"),
        txt = document.getElementById("txt"),
        outige = document.getElementById("outige");

    // Note that jQuery handles "empty" selections "for free".
    // Since we're plain JavaScripting it, we need to make sure this DOM exists first.
    if (txt && go)    {
        txt.addEventListener("keypress", function (e) {
            if (event.keyCode === 13)   {
                go.click();
                e.preventDefault(); // <<< Most important missing piece from icedwater
            }
        });

        go.addEventListener("click", function () {
            if (outige) {
                outige.innerHTML += "Clicked!<br />";
            }
        });
    }
});