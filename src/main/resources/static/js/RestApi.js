/**
 * Created by iMac on 10.11.2017.
 */
function createVaccine() {
    var msg   = $('#formx').serialize();
    $.ajax({
        type:'post',
        headers: {
            accepts:'application/json'
        },
        url:'/api/vaccine',
        data:msg,
        error:  function(xhr, str){
            alert('Возникла ошибка: ' + xhr.responseCode);
        }
    })
}
