function updateClock() {
    var el = document.getElementById("clock");
    if (!el) return;
    var now = new Date();
    var options = {
        year: 'numeric',
        month: 'long',
        day: 'numeric',
        hour: '2-digit',
        minute: '2-digit',
        second: '2-digit'
    };
    el.textContent = now.toLocaleString('ru-RU', options);
}
updateClock();
setInterval(updateClock, 9000);