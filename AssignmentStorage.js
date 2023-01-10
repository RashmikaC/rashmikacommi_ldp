if (!localStorage.getItem("Local-Score"))
  localStorage.setItem("Local-Score", 0);
if (!sessionStorage.getItem("Session-Score"))
  sessionStorage.setItem("Session-Score", 0);
document.querySelector("button").addEventListener("click", (e) => {
  let Local_Score = localStorage.getItem("Local-Score");
  let Session_Score = sessionStorage.getItem("Session-Score");
  Local_Score++;
  Session_Score++;
  localStorage.setItem("Local-Score", Local_Score);
  sessionStorage.setItem("Session-Score", Session_Score);
});
