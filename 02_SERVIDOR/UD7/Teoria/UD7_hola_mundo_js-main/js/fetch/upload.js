

window.onload = async function () {
   await onceLoaded();


};
function onceLoaded() {
    fetch('https://reqres.in/api/users/2', {
        method: 'PUT',
        body: JSON.stringify({
            name: "morpheus",
            job: "zion resident"

        }),
        headers: {
            'Content-type': 'application/json; charset=UTF-8'
        }

    })
        .then((response) => response.json())
        .then((json) => {
            console.log(json);
        })
        .catch((err) => console.error("error:", err));
}